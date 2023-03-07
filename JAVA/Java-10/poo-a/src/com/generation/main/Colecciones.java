package com.generation.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> coleccion = new ArrayList<String>();

		coleccion.add("colecciones");
		coleccion.add("cohorte");
		
		/*coleccion.add(13);
		coleccion.add(15,15);
		coleccion.add('a');
		*/
		
		for (int iterator = 0 ; iterator < coleccion.size(); iterator++) {
			System.out.println(coleccion.get(iterator));
			
		}
				

	}

}
