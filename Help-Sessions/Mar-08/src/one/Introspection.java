package one;

import java.util.Arrays;

public class Introspection {
  public static void main(String[] args) {
    if (args.length > 0) {
      try {
        // get Class object
        Class cl = Class.forName(args[0]);

        // Extract any interfaces
        System.out.println("Interfaces: ");
        for (var item : cl.getInterfaces()){
          System.out.println("\t" + item.getName());
        }
        System.out.println();

        // ...
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Incorrect number of parameters");
    }
  }
}