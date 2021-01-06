package person;

/*
 * Another example class for use with reflection
 */
public class Person {
  private String name;
  private String userid;

  public Person() {
    this("Fred", "xyz123");
  }

  /**
   * @param name
   * @param userid
   */
  public Person(String name, String userid) {
    this.name = name;
    this.userid = userid;
  }

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
  public String toString() {
    return "Class: " + this.getClass() + " Name: " + this.getName() + " User Id: " + this.getUserid();
  }

}