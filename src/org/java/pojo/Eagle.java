package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.in.IVolante;

public class Eagle extends Animal implements IVolante {

	@Override
	public void verso() {
		System.out.println("KRAAA KRAAA");
	}

	@Override
	public void mangia() {
		System.out.println("L'aquila mangia carne");
	}

	public void vola() {
		System.out.println("Sono un'aquila e sto volando!!");
	}

	@Override
	public void faiVolare() {
		vola();
	}
}
