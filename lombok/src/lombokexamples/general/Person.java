package lombokexamples.general;

//import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
  private String firstName;
  private String lastName;
  private int age;

//  public Person(String firstName, String lastName, int age) {
//    this.firstName = firstName;
//    this.lastName = lastName;
//    this.age = age;
//  }
//
//  public String getFirstName() {
//    return firstName;
//  }
//
//  public void setFirstName(String firstName) {
//    this.firstName = firstName;
//  }
//
//  public String getLastName() {
//    return lastName;
//  }
//
//  public void setLastName(String lastName) {
//    this.lastName = lastName;
//  }
//
//  public int getAge() {
//    return age;
//  }
//
//  public void setAge(int age) {
//    this.age = age;
//  }
//
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (!(o instanceof Person)) return false;
//    Person person = (Person) o;
//    return getAge() == person.getAge() &&
//            getFirstName().equals(person.getFirstName()) &&
//            getLastName().equals(person.getLastName());
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(getFirstName(), getLastName(), getAge());
//  }
//
//  @Override
//  public String toString() {
//    return "Person{" +
//            "firstName='" + firstName + '\'' +
//            ", lastName='" + lastName + '\'' +
//            ", age=" + age +
//            '}';
//  }
}
