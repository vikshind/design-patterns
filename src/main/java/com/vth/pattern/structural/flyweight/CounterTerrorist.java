package com.vth.pattern.structural.flyweight;

public class CounterTerrorist implements Player {
	// Intrinsic Attribute
	private final String TASK;

	// Extrinsic Attribute
	private String weapon;

	public CounterTerrorist() {
		TASK = "DIFFUSE BOMB";
	}

	public void assignWeapon(String weapon) {
		// Assign a weapon
		this.weapon = weapon;
	}

	public void mission() {
		// Work on the Mission
		System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}
}