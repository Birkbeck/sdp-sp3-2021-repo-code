package lombokexamples.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/*
 * The class has four fields, two of them are final so we need a constructor.
 * The flag field is a boolean so the getter is named isFlag() and not getFlag()
 * The strList getter method initialise the list if necessary
 * The strList is not included in the toString method
 * Equals and hashCode are calculated on number and text fields only.
 */

public class Original {
  private final int number;
  private final String text;
  private boolean flag;
  private List<String> strList;

  public Original(int number, String text) {
    this.number = number;
    this.text = text;
  }

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public List<String> getStrList() {
    if (strList == null) {
      strList = new ArrayList<>(128);
    }
    return Collections.unmodifiableList(strList);
  }

  public void setStrList(List<String> strList) {
    this.strList = strList;
  }

  public int getNumber() {
    return number;
  }

  public String getText() {
    return text;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 11 * hash + this.number;
    hash = 11 * hash + Objects.hashCode(this.text);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Original other = (Original) obj;
    if (this.number != other.number) {
      return false;
    }
    return Objects.equals(this.text, other.text);
  }

  @Override
  public String toString() {
    return "WithoutLombokAnnotations{" + "flag=" + flag + ", number=" + number + ", text = " + text + '}';
  }
}