package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.in.IVolante;

public class Sparrow extends Animal implements IVolante {

	@Override
	public void verso() {
		System.out.println("CIP CIP");	
	}

	@Override
	public void mangia() {
		System.out.println("Il passero mangia gli insetti");
	}
	
	public void vola() {
		System.out.println("Sono un passero e sto volando!!");
	}

	@Override
	public void faiVolare() {
		vola();
	}
	
}
