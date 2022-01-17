
public class DirectMessage {
	private int id;
	private User contact;
	private Message[] messages;
	public DirectMessage() {
		super();
	}
	public DirectMessage(int id, User contact) {
		super();
		this.id = id;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getContact() {
		return contact;
	}
	public void setContact(User contact) {
		this.contact = contact;
	}
	public Message[] getMessages() {
		return messages;
	}
	public void setMessages(Message[] messages) {
		this.messages = messages;
	}
}
