package lombokexamples.immutable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Wither;

import java.time.Instant;

/*
 * A @RequiredArgsConstructor annotation has been introduced.
 * What it does is generate a constructor for all final fields that have not already been initialised.
 * In cases where we want to reuse a previously issued LoginResonse (imagine, for example, a “refresh token” operation),
 * we certainly don’t want to modify our existing instance, but rather, we want to generate a new one based on it.
 * See how the @Wither annotation helps us here: It tells Lombok to generate a withTokenExpiryTs(Instant tokenExpiryTs)
 * method that creates a new instance of LoginResponse having all the with’ed instance values,
 * except the new one we’re specifying.
 * Would you like this behaviour for all fields?
 * Just add @Wither to the class declaration instead.
 */

@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public final class LoginResponse {
  private final long userId;
  private final @NonNull String authToken;
  private final @NonNull Instant loginTs;

  @Wither
  private final @NonNull Instant tokenExpiryTs;

}