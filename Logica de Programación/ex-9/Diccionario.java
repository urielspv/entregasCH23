import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        // Crear diccionario
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("conejo", "rabbit");
        diccionario.put("elefante", "elephant");
        diccionario.put("tigre", "tiger");
        diccionario.put("jirafa", "giraffe");
        diccionario.put("mono", "monkey");
        diccionario.put("oso", "bear");
        diccionario.put("cebra", "zebra");
        diccionario.put("rinoceronte", "rhinoceros");
        diccionario.put("hipopótamo", "hippopotamus");
        diccionario.put("serpiente", "snake");
        diccionario.put("cocodrilo", "crocodile");
        diccionario.put("león", "lion");
        diccionario.put("pingüino", "penguin");
        diccionario.put("pato", "duck");
        diccionario.put("abeja", "bee");
        diccionario.put("araña", "spider");
        diccionario.put("gusano", "worm");
        diccionario.put("ratón", "mouse");

        // Pedir palabra en español
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra en español:");
        String palabra = scanner.nextLine();

        // Buscar traducción en el diccionario
        String traduccion = diccionario.get(palabra);

        // Mostrar resultado
        if (traduccion != null) {
            System.out.println("La traducción de " + palabra + " es " + traduccion);
        } else {
            System.out.println("No se encontró traducción para " + palabra);
        }
    }
}
