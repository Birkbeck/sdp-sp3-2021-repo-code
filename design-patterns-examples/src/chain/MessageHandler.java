package chain;

public abstract class MessageHandler {
  private MessageHandler next;

  public MessageHandler(MessageHandler next) {
    this.next = next;
  }

  public void handle(Message message) {
    if (next != null) {
      next.handle(message);
    }
  }
}