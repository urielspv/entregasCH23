package tiposDatosVariables;

public class Java04 {
	
	public static void main(String[] args) {
		
		/*int edad =18;
		boolean tieneLicencia = true;
		if(edad >= 18 && tieneLicencia) {//siempre tiene que ser verdadero
			System.out.println("Puede conducir un coche");			
		}
		else {
			System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		
		if (nombre.equals(nombre) || (apellido.equals(apellido)){
			System.out.println("El usuario coincide con juan o pérez");
			
		}
		else {
			System.out.println("Ni es Juan ni es pérez");
		}
		
		*/
		
		
		/*Verificar si un número es par y positivo:
			int num = 6;

			Verificar si un número está dentro de un rango específico
			int num = 10;

			Verificar si una cadena es igual a otra o no
			String cadena1 = "Hola";
			String cadena2 = "hola";
		*/
		
		//Ejercicio 1
		
		int num = 6;
		
		if((num%2 == 0) && (num > 0)) {
			System.out.println("Si es positivo y par");
		}
		else {
			System.out.println("No cumple las condiciones");
		}
		
		//Ejercicio 2
		
		int num2 = 10;
		
		if( (num2 >0) && (num2 <= 50) ) {
			System.out.println("El numero está dentro del rango");
		}else {
			System.out.println("El numero no está dentro del rango :(");
		}
		
		//Ejercico 3
		
		String saludo1 = "Hola";
		String saludo2 = "hola";
		

		if( saludo1 == saludo2) {
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("Las cadenas son diferentes");
		}
		
		
		
		
		
	}

}
