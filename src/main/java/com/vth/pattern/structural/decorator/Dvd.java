package com.vth.pattern.structural.decorator;

public class Dvd extends LibraryItem {

	private String director;
	private String title;
	private int playTime;

	// Constructor
	public Dvd(String director, String title, int numCopies, int playTime) {
		this.director = director;
		this.title = title;
		this.numCopies = numCopies;
		this.playTime = playTime;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	@Override
	public void display() {
		System.out.println("\nDvd ----- ");
		System.out.println(" Director: " + director);
		System.out.println(" Title: " + title);
		System.out.println(" # Copies: " + numCopies);
		System.out.println(" Playtime: " + playTime);
	}
}
