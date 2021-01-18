package ch09.sec02;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path absolute = Paths.get("/", "home", "cay");
        Path relative = Paths.get("myprog", "conf", "user.properties");
        System.out.println(absolute);
        System.out.println(relative);
        Path homeDirectory = Paths.get("/home/cay");
        System.out.println(homeDirectory);
        
        Path workPath = homeDirectory.resolve("myprog/work");
        System.out.println(workPath);
        Path tempPath = workPath.resolveSibling("temp");
        System.out.println(tempPath);
        
        relative = Paths.get("/home/cay").relativize(Paths.get("/home/fred/myprog"));
        System.out.println(relative);
        
        Path normalized = Paths.get("/home/cay/../fred/./myprog").normalize();
        System.out.println("normalized: " + normalized);
        
        absolute = Paths.get("config").toAbsolutePath();
        System.out.println("absolute: " + absolute);
        
        Path p = Paths.get("/home", "cay", "myprog.properties");
        System.out.println("p: " + p);
        Path parent = p.getParent(); 
        System.out.println("parent of p: " + parent);
        Path file = p.getFileName(); 
        System.out.println("file of p: " + file);
        Path root = p.getRoot(); 
        System.out.println("root of p: " + root);
        Path first = p.getName(0);
        System.out.println("first of p: " + first);
        Path dir = p.subpath(0, p.getNameCount() - 1);
        System.out.println("dir of p: " + dir);
        
        System.out.println("Components of p");
        for (Path component : p) {
            System.out.println(component);
        }
    }
}
