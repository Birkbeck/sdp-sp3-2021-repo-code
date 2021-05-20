package mighthelp;

public interface Thing {
  default void execute() {
    System.out.println(getClass());
  }
}