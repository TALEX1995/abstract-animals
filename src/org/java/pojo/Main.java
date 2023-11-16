package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.in.INuotante;
import org.java.pojo.in.IVolante;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[4];
		
		Dog dog = new Dog();
		
		animals[0] = dog;
		
		Sparrow sparrow = new Sparrow();
		
		animals[1] = sparrow;
		
		Eagle eagle = new Eagle();
		
		animals[2] = eagle;
		
		Dolphin dolphin = new Dolphin();
		
		animals[3] = dolphin;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].dormi();
			animals[i].mangia();
			animals[i].verso();
		}
		
		IVolante[] volante = new IVolante[2];
		
		volante[0] = sparrow;
		
		volante[1] = eagle;
		
		INuotante[] nuotante = new INuotante[1];
		
		nuotante[0] = dolphin;
		
		for(int i = 0; i < volante.length; i++) {
			faiVolare(volante[i]);
		}
		
		for(int i = 0; i < nuotante.length; i++) {
			faiNuotare(nuotante[i]);
		}
		
	}
	
	
	public static void faiVolare(IVolante i) {
		i.faiVolare();
	}
	
	public static void faiNuotare(INuotante n) {
		n.faiNuotare();
	}
	
	

}
