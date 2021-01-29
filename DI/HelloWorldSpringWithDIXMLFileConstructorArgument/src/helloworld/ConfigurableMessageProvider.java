package helloworld;

public class ConfigurableMessageProvider implements MessageProvider {

  private String message;

  public ConfigurableMessageProvider(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }

}