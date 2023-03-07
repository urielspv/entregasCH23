package com.generation.main;

import com.generation.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(2);
		
		ClaseGenerica <String> stringObj = new ClaseGenerica<String>("Prueba String");
		
		intObj.claseTipo();
		stringObj.claseTipo();
		

	}

}
