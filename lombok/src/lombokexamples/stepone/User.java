package lombokexamples.stepone;

import java.io.Serializable;
import java.time.Instant;

public class User implements Serializable {

  private String email;

  private String firstName;
  private String lastName;

  private Instant registrationTs;

  private boolean payingCustomer;

  // Empty constructor implementation: ~3 lines.
  // Utility constructor for all attributes: ~7 lines.
  // Getters/setters: ~38 lines.
  // equals() and hashCode() as per email: ~23 lines.
  // toString() for all attributes: ~3 lines.

  // Relevant: 5 lines; Boilerplate: 74 lines => 93% meaningless code :(

}