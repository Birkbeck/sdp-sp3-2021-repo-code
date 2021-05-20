package lsp;

public class RogueShape implements Shape {
  public double getArea(){
    throw new RuntimeException();
  }
}