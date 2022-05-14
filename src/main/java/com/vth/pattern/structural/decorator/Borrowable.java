package com.vth.pattern.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class Borrowable extends Decorator {

	private List<String> borrowers = new ArrayList<>();

	public Borrowable(LibraryItem libraryItem) {
		super(libraryItem);
	}

	public void borrowItem(String name) {
		borrowers.add(name);
		libraryItem.numCopies--;
	}

	public void returnItem(String name) {
		borrowers.remove(name);
		libraryItem.numCopies++;
	}

	@Override
    public void display()
    {
        super.display();
        for (String borrower : borrowers)
        {
            System.out.println(" borrower: " + borrower);
        }
    }
}
