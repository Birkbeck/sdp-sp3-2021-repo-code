package fails;

import java.util.ArrayList;

public class Example {
  private int one;
  private String two;
  private boolean flag;
  private double three;
  private ArrayList<Integer> broken = new ArrayList<>();

  int nonPrivateField;

  public Example(int x){
    nonPrivateField = x;
  }

  private void helperOne(){}

  public void ohNo() throws Exception {}

  public int returnsAnInt(){ return 0;}

}
