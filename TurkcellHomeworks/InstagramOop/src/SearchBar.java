
public class SearchBar {
	private SearchResult[] recent;
	private int amount;
	public SearchBar() {
		super();
	}
	public SearchBar(SearchResult[] recent, int amount) {
		super();
		this.recent = recent;
		this.amount = amount;
	}
	public SearchResult[] getRecent() {
		return recent;
	}
	public void setRecent(SearchResult[] recent) {
		this.recent = recent;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
