package impls;

// find all classes in a package

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CheckItOut {
    public static void main(String[] args) throws Exception {
        List<Class> classes = CheckItOut.getClasses(MyInterface.class.getClassLoader(), "impls");
        for (Class c : classes) {
            for (Class cl : c.getInterfaces()) {
                if (cl.getSimpleName().equals("MyInterface")) {
                    System.out.println(c.getSimpleName());
                }
            }
        }
    }

    public static List<Class> getClasses(ClassLoader cl, String pack) throws Exception {
        List<Class> classes = new ArrayList<>();
        URL upackage = cl.getResource(pack);
        //String direct = upackage.substring(5);
        //BufferedReader dis = new BufferedReader(new FileReader(direct));
        DataInputStream dis = new DataInputStream((InputStream) upackage.getContent());
        String line = null;
        while ((line = dis.readLine()) != null) {
            if (line.endsWith(".class")) {
                classes.add(Class.forName(pack + "." + line.substring(0, line.lastIndexOf('.'))));
            }
        }
        return classes;
    }
}


