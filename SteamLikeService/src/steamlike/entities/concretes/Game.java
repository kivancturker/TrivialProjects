package steamlike.entities.concretes;

import java.time.LocalDate;

import steamlike.entities.abstracts.Entity;

public class Game implements Entity {
	private int gameId;
	private String name;
	private String description;
	private double rate; // Critic Rate out of 10.
	private Category category;
	private LocalDate releaseDate;
	private LocalDate lastUpdate;
	public Game() {
		super();
	}
	public Game(int gameId, String name, String description, double rate, Category category, LocalDate releaseDate,
			LocalDate lastUpdate) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.description = description;
		this.rate = rate;
		this.category = category;
		this.releaseDate = releaseDate;
		this.lastUpdate = lastUpdate;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public LocalDate getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(LocalDate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
