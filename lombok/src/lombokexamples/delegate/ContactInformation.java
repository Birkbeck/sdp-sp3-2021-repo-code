package lombokexamples.delegate;

public class ContactInformation implements HasContactInformation {

  private String email;

  private String firstName;
  private String lastName;

  public ContactInformation() {
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ContactInformation)) return false;
    final ContactInformation other = (ContactInformation) o;
    if (!other.canEqual(this)) return false;
    final Object this$email = this.getEmail();
    final Object other$email = other.getEmail();
    if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
    final Object this$firstName = this.getFirstName();
    final Object other$firstName = other.getFirstName();
    if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
    final Object this$lastName = this.getLastName();
    final Object other$lastName = other.getLastName();
    return this$lastName == null ? other$lastName == null : this$lastName.equals(other$lastName);
  }

  protected boolean canEqual(final Object other) {
    return other instanceof ContactInformation;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $email = this.getEmail();
    result = result * PRIME + ($email == null ? 43 : $email.hashCode());
    final Object $firstName = this.getFirstName();
    result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
    final Object $lastName = this.getLastName();
    result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
    return result;
  }

  public String toString() {
    return "ContactInformation(email=" + this.getEmail() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ")";
  }
}