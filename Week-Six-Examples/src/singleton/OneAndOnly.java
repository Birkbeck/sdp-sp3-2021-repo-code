package singleton;

public class OneAndOnly {
  private static OneAndOnly instance = new OneAndOnly();
  private String aField;

  private OneAndOnly(){
    System.err.println("Creation");
  }

  public static OneAndOnly getInstance() { return instance;}

  public String getaField() {
    return aField;
  }

  public void setaField(String aField) {
    this.aField = aField;
  }

//  @Override
//  public String toString() {
//    return "OneAndOnly{" +
//      "aField='" + aField + '\'' +
//      '}';
//  }
}
