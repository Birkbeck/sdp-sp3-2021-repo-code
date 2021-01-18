package helloworld;

public interface MessageRenderer {

	public void render();
	
	// autowiring will deal with these
	// public void setMessageProvider(MessageProvider provider);
	// public MessageProvider getMessageProvider();
}
