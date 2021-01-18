package ch05.sec01;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void print(Scanner in, PrintWriter out) {
        try (in; out) { // Effectively final variables
            while (in.hasNext())
                out.println(in.next().toLowerCase());            
        }
    }
    
    public static void main(String[] args) throws IOException {
        List<String> lines = List.of("Mary had a little lamb. Its fleece was white as snow.".split(" "));
        try (PrintWriter out = new PrintWriter("/tmp/output1.txt")) {
            for (String line : lines) {
                out.println(line.toLowerCase());
            }
        }
        try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
                PrintWriter out = new PrintWriter("/tmp/output2.txt")) {
            while (in.hasNext())
                out.println(in.next().toLowerCase());
        }
        
        PrintWriter out3 = new PrintWriter("/tmp/output3.txt");
        try (out3) {
            for (String line : lines) {
                out3.println(line.toLowerCase());
            }
        }                
    }
}