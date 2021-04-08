package otherdemo;

import java.util.Objects;

public class BImpl implements B {
  private String str;

  BImpl(String str) {
    this.str = str;
  }

  @Override
  public String toString() {
    return "BClass{}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof BImpl)) return false;
    BImpl bClass = (BImpl) o;
    return Objects.equals(str, bClass.str);
  }

  @Override
  public int hashCode() {
    return Objects.hash(str);
  }
}
