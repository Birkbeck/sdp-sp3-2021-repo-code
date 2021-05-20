package driver;

import code.Interpreter;
import code.Result;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
  private static final String FILENAME = "res/input.txt";
  public static void main(String[] args) {
    System.out.println("Reading in program from file...");
    var source = new File(FILENAME);
    try (var input = new Scanner(source);) {
      while (input.hasNextLine()) {
        var data = input.nextLine();
        System.out.println("Parsing input...");
        var arguments = Interpreter.parse(data);
        System.out.println("Loading class...");
        Result res = Interpreter.loadClassAndMethod(arguments);
        System.out.println(res.meth().invoke(null,res.args()));
      }
    } catch (FileNotFoundException | IllegalAccessException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }
}
