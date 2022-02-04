package ecommerce.entity.concretes;

import ecommerce.entity.abstracts.Entity;

public class User  implements Entity {
	private int id;
	private String firtName;
	private String lastName;
	private String email;
	private String password;
	
	public User() {
		super();
	}

	public User(int id, String firtName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
