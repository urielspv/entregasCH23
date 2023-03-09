package com.generation.excepciones;

public class TestExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Division d = new Division(1,0);
			d.visualizarD();
		} catch (OpException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Continua");

	}

}
