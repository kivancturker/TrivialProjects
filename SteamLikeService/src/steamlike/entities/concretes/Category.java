package steamlike.entities.concretes;

import steamlike.entities.abstracts.Entity;

public class Category implements Entity {
	private int categoryId;
	private String name;
	public Category() {
		super();
	}
	public Category(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
