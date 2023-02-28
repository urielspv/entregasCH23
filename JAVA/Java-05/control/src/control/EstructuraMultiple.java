package control;

import java.security.cert.CertPathValidator;
import java.util.Scanner;

public class EstructuraMultiple {
	
	Scanner tec = new Scanner(System.in);
	
	
	public void vocal() {
		
		System.out.println("Introduzca una letra: ");
		char letra = tec.next().charAt(0);
		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Si es vocal");

		default:
			System.out.println("Esto no es un carácter valido");
			break;
		}
		
		
		
	}
	
	public void notas() {
		System.out.println("Introduzca su calificacion: ");
		int nota = tec.nextInt();
		
		switch (nota) {
		
		case 10:System.out.println("Excelente");
			break;
		case 9:
			System.out.println("Muy bien");
			break;
		case 8:
			System.out.println("Bueno");
			break;
		case 7:
			System.out.println("Regular");
			break;
		case 6:
			System.out.println("Deficiente");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobado");
	
			break;

		default:
			break;
		}
	}
	
	public void ternario() {
		System.out.println("Introduzca un primer vlor numerico: ");
		int entradaV = tec.nextInt();
		System.out.println("Intodzca un segundo valor numerico: ");
		int entradaF = tec.nextInt();
		
		int menor = (entradaV <= entradaF)? entradaV : entradaF;
		System.out.println("--->" +menor);
	}
	
	
	
	
	

}
