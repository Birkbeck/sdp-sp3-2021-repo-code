package ch14.sec01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class CompilerDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        String pointCode = makeClass("Point", "int", "x", "int", "y");
        String rectangleCode = makeClass("Rectangle", "Point", "topLeft", "int",
                "width", "int", "height");
        System.out.println(rectangleCode);

        List<StringSource> sources = List.of(
                new StringSource("Point", pointCode), 
                new StringSource("Rectangle", rectangleCode));
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> collector = new DiagnosticCollector<>();
        
        List<ByteArrayClass> classes = new ArrayList<>();
        StandardJavaFileManager stdFileManager = compiler
                .getStandardFileManager(null, null, null);
        JavaFileManager fileManager = new ForwardingJavaFileManager<JavaFileManager>(
                stdFileManager) {
            @Override
            public JavaFileObject getJavaFileForOutput(Location location,
                    String className, Kind kind, FileObject sibling)
                    throws IOException {
                if (kind == Kind.CLASS) {
                    ByteArrayClass outfile = new ByteArrayClass(className);
                    classes.add(outfile);
                    return outfile;
                } else
                    return super.getJavaFileForOutput(location, className,
                            kind, sibling);
            }
        };
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager,
                collector, null, null, sources);
        Boolean result = task.call();
        for (Diagnostic<? extends JavaFileObject> d : collector.getDiagnostics()) {
            System.out.println(d);
        }
        System.out.println(result);
        ByteArrayClassLoader loader = new ByteArrayClassLoader(classes);
        Class<?> cl = Class.forName("Rectangle", true, loader);
        System.out.println(Arrays.toString(cl.getDeclaredFields()));
        System.out.println(Arrays.toString(cl.getDeclaredMethods()));
    }

    public static String makeClass(String name, String... typesAndFields) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("public class %s {\n", name));
        for (int i = 0; i < typesAndFields.length; i += 2) {
            String type = typesAndFields[i];
            String field = typesAndFields[i + 1];
            String ufield = field.substring(0, 1).toUpperCase()
                    + field.substring(1);
            result.append(String.format("    private %s %s;\n", type, field));
            result.append(String.format(
                    "    public %s get%s() { return %s; }\n", type, ufield,
                    field));
            result.append(String.format(
                    "    public void set%2$s(%1$s %3$s) { this.%3$s = %3$s; }\n", type, ufield,
                    field));
        }
        result.append("}\n");
        return result.toString();
    }
}
