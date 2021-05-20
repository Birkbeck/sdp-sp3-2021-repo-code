package bridge.driver;

import bridge.impl.AddImpl;
import bridge.spec.AddInstruction;
import bridge.spec.Instruction;

public class Main {
  public static void main(String[] args) {
    Instruction ins = new AddImpl();
  }
}
