package steamlike.entities.concretes;

import java.util.ArrayList;

import steamlike.entities.abstracts.Entity;

public class User extends Person implements Entity {
	private int userId;
	private String userName;
	private ArrayList<Game> ownedGames = new ArrayList<Game>();
	private float balance = 0;
	public User() {
		super();
	}
	public User(int userId, String userName, Person person) {
		super(person);
		this.userId = userId;
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ArrayList<Game> getOwnedGames() {
		return ownedGames;
	}
	public void setOwnedGames(ArrayList<Game> ownedGames) {
		this.ownedGames = ownedGames;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
