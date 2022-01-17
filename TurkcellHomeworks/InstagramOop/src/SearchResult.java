
public class SearchResult {
	private int id;
	private int title;
	private String url;
	private String image;
	public SearchResult() {
		super();
	}
	public SearchResult(int id, int title, String url, String image) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
