package lombokexamples.delegate;

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
 * We could refactor User to compose with ContactInformation and use Lombok to generate all the required delegating
 * calls to match the interface contract.
 *
 * Note how we do not need to write implementations for the methods of HasContactInformation:
 * this is something we’re telling Lombok to do, delegating calls to our ContactInformation instance.
 */


import lombok.experimental.Delegate;

@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@ToString(exclude = {"password"})
@EqualsAndHashCode(of = {"contactInformation"})
public class User implements HasContactInformation {

  @Getter(AccessLevel.NONE)
  @Delegate(types = {HasContactInformation.class})
  private final ContactInformation contactInformation = new ContactInformation();

  private @NonNull byte[] password;

  private @NonNull Instant registrationTs;

  private boolean payingCustomer;

}