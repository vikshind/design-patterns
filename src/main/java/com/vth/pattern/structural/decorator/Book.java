package com.vth.pattern.structural.decorator;

public class Book extends LibraryItem {

	private String author;
	private String title;

	// Constructor
	public Book(String author, String title, int numCopies) {
		this.author = author;
		this.title = title;
		this.numCopies = numCopies;
	}

	@Override
	public void display() {
		System.out.println("\nBook ------ ");
		System.out.println(" Author: " + author);
		System.out.println(" Title: " + title);
		System.out.println(" # Copies: " + numCopies);
	}
}
