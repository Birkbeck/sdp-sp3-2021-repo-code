package lombokexamples.logging;

import lombok.SneakyThrows;
import lombok.extern.java.Log;

import java.net.URL;

/*
 * Often we want to do something like:
 *
 * private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
 *
 * Lombok implements an annotation that creates a logger instance with a customisable name (defaults to log),
 * supporting the most common logging frameworks on the Java platform.
 *
 * @Log
 *
 * Creates
 *
 * private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
 */
@Log
public class UserService {

  @SneakyThrows
  public URL buildUsersApiUrl() {
    log.info("Building users API URL");
    return new URL("https://apiserver.com/users");
  }

}