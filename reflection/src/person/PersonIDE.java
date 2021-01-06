package person;

import java.util.Objects;

public class PersonIDE {
  private String name;
  private String userid;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof PersonIDE)) return false;
    PersonIDE personIDE = (PersonIDE) o;
    return Objects.equals(getName(), personIDE.getName()) &&
            Objects.equals(getUserid(), personIDE.getUserid());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getUserid());
  }

  @Override
  public String toString() {
    return "PersonIDE{" +
            "name='" + name + '\'' +
            ", userid='" + userid + '\'' +
            '}';
  }
}
