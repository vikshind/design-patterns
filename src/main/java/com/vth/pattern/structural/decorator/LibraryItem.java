package com.vth.pattern.structural.decorator;

public abstract class LibraryItem {
	
	protected int numCopies;

	public int getNumCopies() {
		return numCopies;
	}

	public void setNumOfCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	
	public abstract void display();
}
