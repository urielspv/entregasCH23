package pruebasJunit.uspv.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pruebasJunit.uspv.Calculadora;
class CalculadoraTest {
    private Calculadora ct;
    private Calculadora ct1 = null;
    @BeforeEach
    public void configurandoBefor() {
        ct = new Calculadora();
        System.out.println("Ejecutando BeforeEach ---> configurandoBefore()");
    }
    @AfterEach
    public void configurandoAfter() {
        ct = null; 
        System.out.println("Ejecutando AfterEach ---> configurandoAfter");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }
    @Test
    void calculadoraNull() {
        assertNull(ct1, "La clase es una instancia no nula");
        System.out.println("***  Ejecutando el primer test ---> calculadora   ***");
    }
    @Test
    public void calculadoraNotNull() {
        assertNotNull(ct);
        System.out.println("***  Ejecutando el segundo test ---> calculadora   ***");
    }
    
    /* ****************PRIMERAS PRUEBAS********************* */
    
    @Test
    public void primerosAssert() {
        /*
         * 1. Indicar que se va a evaluar
         * 2. Que es lo que se va a realizar
         * 3. Evaluar con el Assert indicado
         * */
        
        int resultadoEsperado = 10;
        int resultadoActual;
        resultadoActual = ct.sumar(5,5);
        assertEquals(resultadoEsperado, resultadoActual);
        System.out.println("***  Ejecutando 3er test ---> primerosAssert()  ***");
        
    }
    @Test
    public void sumaTest() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20, calculadora.sumar(10, 10));
        System.out.println("***  Ejecutando 4to test ---> primerosAssert()  ***");
    }
    
    
    @Test
    public void tiposAsserts() {
    	assertTrue(1 == 1);
    	assertEquals("Generation ", "Generatio");
    	assertNull(ct1);
    	Calculadora c1 = new Calculadora();
    	Calculadora c2 = new Calculadora();
    	Calculadora c3 = new Calculadora();
    	
    	assertSame(c1,c3);
    	assertNotSame(c2,c3);
    	assertEquals(11,ct.sumar(5, 6));
    	
    	
    }
    
    public void validandoResta() {
    	assertEquals(50, ct.restar(100, 50));
    }
    
    @Test
    
    public void validandoRestaNegativa() {
    	assertEquals(-10, ct.restar(10, 20));
    	
    }
    @Test 
    public void validandoDivision() {
    	assertEquals(2,	ct.division(10,	 5));
    }
    
    @Test 
    public void validandoByZero() {
    	assertThrows(ArithmeticException.class,()->ct.divisionByZero(10, 0));
    }
    
}