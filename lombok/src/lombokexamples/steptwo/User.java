package lombokexamples.steptwo;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Using @Getter and @Setter Lombok generates getters and setters for all attributes.
 * This is because we used the annotations at a class level.
 * If we wanted to selectively specify what to generate for which attributes,
 * we could have annotated the fields themselves.
 * Via @NoArgsConstructor and @AllArgsConstructor, we get a default empty constructor for the class as well as an
 * additional one for all the attributes.
 * The @ToString annotation auto-generates a toString() method, showing by default all class attributes prefixed
 * by their name.
 * Finally, to have the pair of equals() and hashCode() methods defined in terms of the email field
 * we have used @EqualsAndHashCode and parameterised it with the list of relevant fields (just the email in this case).
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"email"})
public class User {

  private String email;

  private String firstName;
  private String lastName;

  private Instant registrationTs;

  private boolean payingCustomer;

}