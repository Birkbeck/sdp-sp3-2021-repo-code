package overloading;

import java.util.Objects;

public class ANewImplementation implements A {
 private String str;
  private String sensibleName;

  public ANewImplementation(String str, String sensibleName) {
    this.str = str;
    this.sensibleName = sensibleName;
  }

  @Override
  public String getStr() {
    return str;
  }

  @Override
  public String aMethod() {return "replacing the default version";}

  @Override
  public String getSensibleName() {
    return sensibleName;
  }

  @Override
  public String getValue(){
    return getStr() + "]";
  }

  @Override
  public String getValue(String s){ // overloading
    return getStr() + s;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ANewImplementation)) return false;
    ANewImplementation that = (ANewImplementation) o;
    return getStr().equals(that.getStr()) && getSensibleName().equals(that.getSensibleName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getStr(), getSensibleName());
  }

  @Override
  public String toString() {
    return "AClassImplementation{" +
      "str='" + getStr() + '\'' +
      ", sensibleName='" + getSensibleName() + '\'' +
      '}';
  }

//  @Override --- provides a check that you are actually overriding a method
//  private int thing() {return 3;}
}