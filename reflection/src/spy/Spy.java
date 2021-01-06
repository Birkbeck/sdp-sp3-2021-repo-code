package spy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Spy {
  private static final long serialVersionUID;

  static {
    serialVersionUID = 1L;
  }

  public Class thisClass;
  public String className;
  public Field[] fields;
  public Method[] methods;
  public boolean atBeginningOfLine;
  public int level;
  public String aaaaa;
  int packageInt;

  {
    atBeginningOfLine = true;
    aaaaa = "Not used, really.";
  }

  private Spy(Class c) {
    thisClass = c;
    className = c.getName();
  }

  private Spy(String className) throws ClassNotFoundException {
    this(Class.forName(className));
  }

  static Spy getSpy(Class c) {
    return new Spy(c);
  }

  static Spy getSpy(String className) throws ClassNotFoundException {
    return new Spy(className);
  }

  public static void printInfo(Field field) {
    System.out.println("    " + field.getName());
    int modifiers = field.getModifiers();
    System.out.println("        Modifiers: " + modifiers);
    System.out.println("        Type:      " + field.getType().getName());
  }

  public static String myGetType(Object obj) {
    return "Not implemented.";
  }

  void printAll(String[] args) {
    System.out.println("----------------------------");
    if (args.length == 0) {
      printClass();
    } else {
      assert args.length > 0;
      for (String str : args) {
        try {
          Spy s = Spy.getSpy(str);
          s.printClass();
        } catch (ClassNotFoundException e) {
          level = 0;
          write("\nClass not found: " + str);
        }
      }
    }
  }

  public void write(String s) {
    if (atBeginningOfLine) {
      for (int i = 0; i < level % 10; i++) {
        System.out.print("   ");
      }
      atBeginningOfLine = false;
    }
    System.out.print(s);
  }

  public void writeln(String s) {
    write(s);
    System.out.println();
    atBeginningOfLine = true;
  }

  public void indent() {
    level++;
  }

  public void exdent() {
    level--;
  }

  public void printClass() {
    printClassHeader();
    printFields();
    printMethods();
    printClassCloser();
  }

  private void printMethods() throws SecurityException {
    methods = thisClass.getMethods();
    writeln("// Methods:");
    indent();
    for (Method m : methods) {
      if (thisClass.equals(m.getDeclaringClass())) {
        printMethod(m);
      }
    }
    exdent();
  }

  void printClassHeader() {
    Class sc = thisClass.getSuperclass();
    int classModifiers = thisClass.getModifiers();

    write(Modifier.toString(classModifiers));
    write(" class ");
    write(className);
    if (sc.getName() != "java.lang.Object") {
      write(" extends " + sc.getName());
    }
    Class[] interfaces = thisClass.getInterfaces();
    if (interfaces.length > 0) {
      write(" implements");
      for (int i = 0; i < interfaces.length; i++) {
        write(i == 0 ? " " : ", ");
        write(interfaces[i].getName());
      }
    }
    writeln(" {");
    indent();
  }

  private void printClassCloser() {
    exdent();
    writeln("}");
  }

  void printFields() {
    fields = thisClass.getFields();
    writeln("// Fields:");
    indent();
    for (Field f : fields) {
      printField(f);
    }
    exdent();
  }

  public void printField(Field field) {
    int modifiers = field.getModifiers();
    write(Modifier.toString(modifiers) + " ");
    write(decodeType(field.getType().getName()));
    write(" " + field.getName() + ";");
    String declaredIn = field.getDeclaringClass().getName();
    if (!className.equals(declaredIn)) {
      write("  // inherited from " + declaredIn);
    }
    writeln("");
  }

  public String decodeType(String typeCode) {
    // horrible code!!
    int arrayLevel = 0;
    StringBuilder brackets = new StringBuilder();
    while (typeCode.charAt(arrayLevel) == '[') {
      arrayLevel++;
      brackets.append("[]");
    }
    // probably should use a hashmap or something similar...
    StringBuilder str = new StringBuilder();
    switch (typeCode.charAt(arrayLevel)) {
      case 'B':
        str.append("byte");
        break;
      case 'C':
        str.append("char");
        break;
      case 'D':
        str.append("double");
        break;
      case 'F':
        str.append("float");
        break;
      case 'I':
        str.append("int");
        break;
      case 'J':
        str.append("long");
        break;
      case 'S':
        str.append("short");
        break;
      case 'Z':
        str.append("boolean");
        break;
      case 'V':
        str.append("void");
        break;
      case 'L':
        str.append(simplifyName(typeCode));
        break;
      default:
        str.append(typeCode);
        break;
    }
    return str.append(brackets).toString();
  }

  public void printMethod(Method method) {
    write(Modifier.toString(method.getModifiers()) + " ");
    write(decodeType(method.getReturnType().getName()));
    write(" " + method.getName() + "(");
    printParameters(method.getParameterTypes());
    writeln(") { }");
  }

  public void printParameters(Class[] parameters) {
    if (parameters.length == 0)
      return;
    write(decodeType(parameters[0].getName()));
    for (Class cl : parameters) {
      write(", " + simplifyName(decodeType(cl.getName())));
      write("[" + decodeType(cl.getName()) + "]");
    }
  }

  public String simplifyName(String name) {
    int last = name.lastIndexOf(".") + 1;
    if (last < 0)
      return name;
    return name.substring(last, name.length() - 1);
  }
}