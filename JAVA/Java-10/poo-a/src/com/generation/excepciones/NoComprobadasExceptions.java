package com.generation.excepciones;

public class NoComprobadasExceptions {
	public static void main(String[] args ) {
		try {
			int division = 10/0;
			System.out.println("---> " + division);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("capturada la excepcion: " + e.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println("El dato es un caracter " + nfe.getMessage());
		}
		
		System.out.println("Continuamos con el lujjo de la aplicacion");
	}

}
