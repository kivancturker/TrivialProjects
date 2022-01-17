
public class Message {
	private int id;
	private String content;
	private User from;
	private User to;
	private String Date;
	public Message() {
		super();
	}
	public Message(int id, String content, User from, User to, String date) {
		super();
		this.id = id;
		this.content = content;
		this.from = from;
		this.to = to;
		Date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getFrom() {
		return from;
	}
	public void setFrom(User from) {
		this.from = from;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
}
