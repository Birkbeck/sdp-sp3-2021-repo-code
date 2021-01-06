package lombokexamples.delegate;

/*
 * Now we are able to fluently create new users.
 */

import lombokexamples.builder.User;

import java.nio.charset.StandardCharsets;
import java.time.Instant;

public class Main {
  public static void main(String[] args) {
    User user = User
            .builder()
            .email("joe.bloggs@email.om")
            .password("secret".getBytes(StandardCharsets.UTF_8))
            .firstName("Joe")
            .lastName("Bloggs")
            .registrationTs(Instant.now())
            .build();

    System.out.println(user);
  }
}
