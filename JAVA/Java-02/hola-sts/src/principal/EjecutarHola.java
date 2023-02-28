package principal;

import java.util.Scanner;

import clases.*;


public class EjecutarHola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		/*Hola mensaje = new Hola();
		
		mensaje.saludo();
		
		Hola objHJ1 = new Hola();
		
		objHJ1.saludo();
		
		//NuevoHola nh = new NuevoHola("Ursulo");
		//nh.saludo();*/
		
		System.out.println("Ingresa tu nombre porfa compa: ");
		String nombre = teclado.next();
		
		NuevoHola nh1 = new NuevoHola();
		nh1.saludoConNombreString(nombre);
		

	}

}
