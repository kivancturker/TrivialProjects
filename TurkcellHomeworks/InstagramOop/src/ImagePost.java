
public class ImagePost extends Post {
	private String image;

	public ImagePost(int id, String postName, User tags[]) {
		super(id, postName, tags);
	}

	public ImagePost(String image, int id, String postName, User tags[]) {
		super(id, postName, tags);
		this.image = image;
	}
	
}
