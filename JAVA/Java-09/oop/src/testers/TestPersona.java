package testers;

import oop.clases.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		System.out.println("---> "+ p.getNombre());
		p.setNombre("Martha");
		System.out.println("---> "+ p.getNombre());
		
		Persona p0 = new Persona("Uuriel");
		System.out.println("---> "+ p0.getNombre());

		Persona p1 = new Persona("Zedd", 90, 1.85, 85.3, "No se");
		System.out.println("---> "+ p1.datosPersona());
	}

}