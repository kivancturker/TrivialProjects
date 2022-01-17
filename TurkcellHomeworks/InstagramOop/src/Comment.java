
public class Comment {
	private int id;
	private String content;
	private Comment[] replies;
	private User[] likes;
	public Comment() {
		super();
	}
	public Comment(int id, String content) {
		super();
		this.id = id;
		this.content = content;
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
	public Comment[] getReplies() {
		return replies;
	}
	public void setReplies(Comment[] replies) {
		this.replies = replies;
	}
	public User[] getLikes() {
		return likes;
	}
	public void setLikes(User[] likes) {
		this.likes = likes;
	}
	
}
