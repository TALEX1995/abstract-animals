package org.java.pojo;

import org.java.pojo.abs.Animal;

public class Dog extends Animal {

	@Override
	public void verso() {
		System.out.println("BAU BAU");
	}

	@Override
	public void mangia() {
		System.out.println("il cane mangia sia la carne che le verdure");
	}

}
