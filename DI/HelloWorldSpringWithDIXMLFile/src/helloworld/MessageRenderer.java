package helloworld;

public interface MessageRenderer {

	public void render();

	public void setMessageProvider(MessageProvider provider);

	public MessageProvider getMessageProvider();
}
