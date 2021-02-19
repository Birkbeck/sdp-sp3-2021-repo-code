package mighthelp;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("resources/file.txt");
    try (BufferedReader br = Files.newBufferedReader(path)) {
      var str = br.readLine();
      while (str != null) {
        execute(process(str));
        str = br.readLine();
      }
    }
  }

  private static Thing process(String s) {
    return ConcreteThingFactory.getInstance(s);

//      switch (s) {
//      case "Add" -> new AddImplementation();
//      default -> new NotImplemented();
//    };
  }

  private static void execute(Thing t) {
    t.execute();
  }
}

// Example of "helper" class as a "nested" class
class LinkedList {
  private class Node {
  }
}

