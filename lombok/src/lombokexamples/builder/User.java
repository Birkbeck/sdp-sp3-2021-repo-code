package lombokexamples.builder;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/*
 * For our User example, if we want to create a new instance, we’ll need to use a constructor with up to six arguments.
 * This is already a rather large number, which will get even worse if we further add attributes to the class.
 * Also suppose we’d want to set some default values for the lastName and payingCustomer fields.
 *
 * Lombok implements a very powerful @Builder feature, allowing us to use a Builder Pattern to create new instances.
 */


@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@ToString(exclude = {"password"})
@EqualsAndHashCode(of = {"email"})
@Builder
public class User {

  private @NonNull String email;

  private @NonNull byte[] password;

  private @NonNull String firstName;
  private @NonNull String lastName;

  private @NonNull Instant registrationTs;

  private boolean payingCustomer;

}