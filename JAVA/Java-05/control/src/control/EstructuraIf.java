package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	
	public void controlIf() {
		long nota = 6;
		
		if (nota > 5) {
			System.out.println("Nota aprobatoria "+ nota);
		}
		else {
			System.out.println("Nota no aprobada");
		}
		
	}
	
	public void divisible() {
		System.out.println("Introduzca el primer número: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero:");
		int dato2 = entrada.nextInt();
		
		if(dato1 % dato2 == 0) {
			System.out.println(dato1 + " Si es divisible entre " + dato2);
		}
		else {
			System.out.println(dato1 + " No es divisible entre " + dato2);
			
		}
		
	}
	
	public void compara() {
		System.out.println("Introduzca el primer dato: ");
		int valor1 = entrada.nextInt();
		System.out.println("Introduzca el segundo dato:");
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
			System.out.println(valor1 + " Es mayor que " + valor2);
			
		}
		else {
			System.out.println("");
		}
		
		
		
	}
	
	public void anidado() {
		System.out.println("Ingrese el valor: ");
		int mayor1 = entrada.nextInt();
		if(mayor1 > 0) {
			System.out.println(mayor1 + " Es positivo ");
		}
		else {
			if (mayor1 < 0) {
				System.out.println(mayor1 + " Es negativo");
				
			}
			else {
				System.out.println(mayor1 + " es 0");
			}
		}
		
	}
	
}
