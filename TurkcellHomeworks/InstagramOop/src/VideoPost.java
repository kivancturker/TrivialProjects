
public class VideoPost extends Post {
	private String video;
	private int duration;
	public VideoPost(int id, String postName, User tags[]) {
		super(id, postName, tags);
	}
	public VideoPost(String video, int duration, int id, String postName, User tags[]) {
		super(id, postName, tags);
		this.video = video;
		this.duration = duration;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
