package code;

import java.lang.reflect.Method;

public class Interpreter {
  public static String[] parse(String data) {
    var args = data.split(" ");
    return args;
  }

  public static Result loadClassAndMethod(String[] arguments) {
    Class cl = null;
    try {
      cl = Class.forName("items." + arguments[0]);
      //System.out.println(cl.getCanonicalName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    var methodName = arguments[1];
    Class[] argsTypes = parseArgTypes(arguments);

    Method meth = null;
    try {
      meth = cl.getDeclaredMethod(methodName, argsTypes);
      System.out.println(meth);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }

    Object[] objArray = new Object[arguments.length - 2];
    System.arraycopy(arguments, 2, objArray, 0, arguments.length - 2);

    return new Result(meth, objArray);
  }

  private static Class[] parseArgTypes(String[] arguments) {
    var noOfArgs = arguments.length - 2;
    String[] args = new String[noOfArgs];
    System.arraycopy(arguments, noOfArgs, args, 0, noOfArgs);
    Class[] types = new Class[noOfArgs];
    for (int index = 0; index < noOfArgs; index++) {
      types[index] = Integer.valueOf(Integer.parseInt(args[index])).getClass();
    }
    return types;
  }
}
