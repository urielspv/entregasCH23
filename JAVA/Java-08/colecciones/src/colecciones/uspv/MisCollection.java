package colecciones.uspv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MisCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wrapperClass();
		//MisCollection c = new MisCollection();
		//c.imprimir(c.listasCollections());
		
		mapCollections();
		
	}
	
	private static  void mapCollections() {
		Map m = new HashMap();
		m.put("Valor1","Juan");
		m.put("Valor2","Pancho");
		m.put("Valor3","Maria");
		m.put("Valor4","Karla");
		
		imprimir(m.values());
		
	}
	
	Set setCollection() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.remove("uno"); //busca coincidencias y la booraa
		miSet.clear();//borra toda la lista
		return miSet;
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
	
	private List  listasCollections() {
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista "+ miLista.size());
		System.out.println("Está vacia "+ miLista.isEmpty());
		
		miLista.add(4);
		miLista.add(3);
		miLista.add(2);
		miLista.add(0,"Pato");
		miLista.add(0,3);
		System.out.println(miLista + "Tamaño de la lista "+ miLista.size());
		System.out.println("Está vacia "+ miLista.isEmpty());
		                 
		miLista.set(0, miLista);
		miLista.remove(0);
		return miLista;
	}
	
	private static  void imprimir(Collection collection) {
		for(Object elementos : collection) {
			System.out.println("elementos" + elementos);
			
		}
	}
}
