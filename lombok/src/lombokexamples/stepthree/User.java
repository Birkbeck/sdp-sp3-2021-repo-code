package lombokexamples.stepthree;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/*
 * We would like to lower the visibility of the default constructor.
 * We expect consumers of the class to only call the constructor that takes all fields.
 * To enforce this, we are customising the generated constructor with AccessLevel.PACKAGE.
 * We want to ensure that the fields never get assigned null values, neither via the constructor nor via
 * the setter methods.
 * Annotating class attributes with @NonNull is sufficient; Lombok will generate null checks throwing
 * NullPointerException when appropriate in the constructor and setter methods.
 * We add a password attribute, but do not want it shown when calling toString() for security reasons.
 * This is accomplished via the excludes argument of @ToString.
 * We are exposing state publicly via getters, but would prefer to restrict outside mutability.
 * Therefore we leave the @Getter as is, but again using AccessLevel.PROTECTED for @Setter.
 * We might also like to force some constraint on the email field so that, if it gets modified,
 * some kind of check is run.
 * For this, we just implement the setEmail() method ourselves.
 * Lombok will just omit generation for a method that already exists.
 */

@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@ToString(exclude = {"password"})
@EqualsAndHashCode(of = {"email"})
public class User {

  private @NonNull String email;

  private @NonNull byte[] password;

  private @NonNull String firstName;
  private @NonNull String lastName;

  private @NonNull Instant registrationTs;

  private boolean payingCustomer;

  protected void setEmail(String email) {
    // Check for null (=> NullPointerException)
    // and valid email code (=> IllegalArgumentException)
    this.email = email;
  }

}