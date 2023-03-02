package Funciones;

public class Funciones { //clase llamada Funciones
    
    
    //Las funciones se pueden declarar en cualquier lugar de la clase (si retorna algo)
    public static int sumar (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }//cierre sumar
    
    
    
    //Funcion para imprimir asteriscos (void)
    public static void imprimirAsteriscos() {
        System.out.println("**********");
    }//cierre imprimirAsteriscos

    
    //Funcion que combina distintos tipos de valores
    public static float sumaDecimal (float valor1, int valor2) {
        int resultadoDecimal = (int) (valor1 + valor2);
        return resultadoDecimal;
    }
    
    
    
    //Fncion que usa Strings como argumentos
    
    public static String awitaDeLimon(String ingrediente1, String ingrediente2, String ingrediente3) {
    	String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
    	return recetaCompletada;
    }
    
    //Ejercico 1
    public static void calcula() {
    	double distBaja =100.0 ,angA = 30.0 ,angB = 90.0, angC = 60.0;
    	double altTorre, distAlta;
    	
    	
    	
    	
    }
    
    //Este metodo tiene como funcion, ejecutar cosas
    public static void main(String[] args) {

        //Las invocaciones de la funcion se hacen generalmente dentro del metodo principal o main
        System.out.println("El resultado de la suma es: " + sumar(5,8));
        
        imprimirAsteriscos();
        
        System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f, 5));
        
        System.out.println("Estos son los pasos para ppreparar aguita de limon" + awitaDeLimon("AGUA", "LIMON", "AZUCAR"));
        
        
        //Funciones de la biblioteca de matematicas
        double valorEjemplo = 7.456783d;
        System.out.println("La raiz cuadrada de  mis valores es:" + Math.sqrt(valorEjemplo));
        
        
        
    }//cierre de metodo main

}//cierre de clase Funciones


/*

Funciones 

    - No retornan valores: No devuelven nada, no se especifica nada, y no usamos la palabra return.
    
    - Si retornan valores: Se especifica el tipo de dato del argumento, el tipo de valor que regresa y se usa return para esto.


    - Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }
     
     

    


    


*/