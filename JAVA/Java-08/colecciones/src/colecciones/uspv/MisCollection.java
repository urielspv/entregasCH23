package colecciones.uspv;

import java.util.ArrayList;
import java.util.List;

public class MisCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wrapperClass();
		

	}

	
	
	static void wrapperClass() {
		byte numeroB = 12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor MAX " + Byte.MAX_VALUE);
		System.out.println("Valor MIN " + Byte.MIN_VALUE);
		System.out.println("--> "+numeroB);
		
		int numeroI = 1243;
		System.out.println("Tamaño de un Int " + Integer.SIZE);
		System.out.println("Valor MAX " + Integer.MAX_VALUE);
		System.out.println("Valor MIN " + Integer.MIN_VALUE);
		System.out.println("--> "+numeroI);
		
		
		short numeroS = 1;
		System.out.println("Tamaño de un Long " + Short.SIZE);
		System.out.println("Valor MAX " + Short.MAX_VALUE);
		System.out.println("Valor MIN " + Short.MIN_VALUE);
		System.out.println("--> "+numeroS);
		
		long numeroL = 134432;
		System.out.println("Tamaño de un Long " + Long.SIZE);
		System.out.println("Valor MAX " + Long.MAX_VALUE);
		System.out.println("Valor MIN " + Long.MIN_VALUE);
		System.out.println("--> "+numeroL);
		
		double numeroF = 12.3;
		System.out.println("Tamaño de un Double " + Double.SIZE);
		System.out.println("Valor Max " + Double.MIN_VALUE);
		System.out.println("--> "+numeroF);
		
		
	}
	
	public void listasCollections() {
		List<Integer> miLista = new ArrayList();
		
		miLista.add(4);
		miLista.add(3);
		miLista.add(2);
		
		
		
	}
	
	private void imprimir(Collection collection) {
		
	}
}
