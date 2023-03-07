package com.generation.main;

import com.generation.clases.Taco;

public class TestTaco {

	public static void main(String[] args) {
		Taco taco1 = new Taco();
		
		taco1.setGuisado("chicharron");
		taco1.setNumeroDeTortilla(2);
		taco1.setPrecio(20);
		taco1.setTamanioDeTortilla("grande");
		taco1.setTipoDeTortilla("harina");
		
		taco1.preparar();
		taco1.ponerSalsa();
		taco1.subirPrecio(2);
		taco1.vender();
		
		
		System.out.println(taco1.toString());
		
	}

}
