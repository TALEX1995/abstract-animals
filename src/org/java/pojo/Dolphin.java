package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.in.INuotante;

public class Dolphin extends Animal implements INuotante{

	@Override
	public void verso() {
		System.out.println("KRI-RI-Ri");
		
	}

	@Override
	public void mangia() {
		System.out.println("Il delfino mangia pesce");
	}
	
	public void nuota() {
		System.out.println("Sono un delfino e sto nuotando!!");
	}

	@Override
	public void faiNuotare() {
		nuota();
	}

}
