
public class Post {
	private int id;
	private String postName;
	private User[] likes;
	private User[] tags;
	public Post() {
		super();
	}
	public Post(int id, String postName, User[] tags) {
		super();
		this.id = id;
		this.postName = postName;
		this.tags = tags;
	}
}
