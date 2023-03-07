package com.generation.clases;

public class ClaseGenerica <T>{
	T obj;
	public ClaseGenerica(T obj) {
		this.obj = obj;
		
	}
	
	public void claseTipo() {
		System.out.println("El tipo de dato es ----->" +  obj.getClass().getName());
	
	}


}
