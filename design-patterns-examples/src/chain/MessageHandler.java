package chain;

public abstract class MessageHandler {
  private MessageHandler next;

  public MessageHandler(MessageHandler next) {
    this.next = next;
  }

  public void handle(Message message) {
    if (this.next != null) {
      this.next.handle(message);
    }
  }
}