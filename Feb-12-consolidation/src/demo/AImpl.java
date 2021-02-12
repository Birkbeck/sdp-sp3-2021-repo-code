package demo;

import java.util.Objects;

public class AImpl implements A {
  protected String another;
  private String str;


  public AImpl(String str, String another) {
    this.str = str;
    this.another = another;
  }

  @Override
  public String getStr() {
    return str;
  }

  @Override
  public void setStr(String str) {
    this.str = str;
  }

  @Override
  public String getAnother() {
    return another;
  }

  @Override
  public void setAnother(String another) {
    this.another = another;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof A)) return false;
    A aClass = (A) o;
    return Objects.equals(getStr(), aClass.getStr()) && Objects.equals(getAnother(), aClass.getAnother());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getStr(), getAnother());
  }

  @Override
  public String toString() {
    return getClass().getName() +
      "{str='" + str + '\'' +
      ", another='" + another + '\'' +
      '}';
  }
}
