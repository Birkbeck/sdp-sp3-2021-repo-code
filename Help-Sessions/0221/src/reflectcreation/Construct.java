package reflectcreation;

public class Construct {
  private String first;
  private String second;
  private int third;
  private boolean fourth;

  public Construct(String a, String b, Integer c, Boolean d){
    first = a;
    second = b;
    third = c;
    fourth = d;
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("First: ").append(first).append("\n")
      .append("Second: ").append(second).append("\n")
      .append("Third: ").append(third).append("\n")
      .append("Fourth: ").append(fourth);
    return sb.toString();
  }
}
