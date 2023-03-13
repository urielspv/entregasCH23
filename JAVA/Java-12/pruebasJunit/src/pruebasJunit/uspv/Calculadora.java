package pruebasJunit.uspv;

public class Calculadora {
	
	public int sumar(int a,int b) {
		return a + b;
	}
	
	public int restar(int a, int b) {
		return a - b;
	}
	public double division(double d1, double d2) {
		return  d1/d2;
	}
	
	public int multiplicacion(int m1, int m2) {
		return m1* m2;
	}
	
	public double divisionByZero(int a , int b) {
		
		if(b==0) {
			//exception de la division
			throw new ArithmeticException("No se puede dividir por cero ne");
		}
		return a/b;
	}

}
