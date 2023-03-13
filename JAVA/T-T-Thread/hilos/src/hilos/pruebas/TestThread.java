package hilos.pruebas;

import hilos.formathread.hilo1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Thread h = new hilo1("Juan");
	        System.out.println(h.getState());

	}

}
