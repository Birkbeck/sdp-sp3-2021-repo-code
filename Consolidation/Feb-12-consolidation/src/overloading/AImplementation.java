package overloading;

import java.util.Objects;

public class AImplementation implements A {
 private String str;
  private String sensibleName;

  public AImplementation(String str, String sensibleName) {
    this.str = str;
    this.sensibleName = sensibleName;
  }

  @Override
  public String getStr() {
    return str;
  }

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
    if (!(o instanceof AImplementation)) return false;
    AImplementation that = (AImplementation) o;
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

}
