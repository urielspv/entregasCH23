import java.util.Scanner;

public class Ordena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Solicitar los números al usuario y almacenarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números del array, moviendo los primos al principio
        int indicePrimos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 2) {
                continue; // Descartar números menores que 2
            }
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(numeros[i]); j++) {
                if (numeros[i] % j == 0) {
                    esPrimo = false;
                    break; // Salir del ciclo si no es primo
                }
            }
            if (esPrimo) {
                int temp = numeros[i];
                numeros[i] = numeros[indicePrimos];
                numeros[indicePrimos] = temp;
                indicePrimos++;
            }
        }

        // Mostrar el array resultante
        System.out.println("Array resultante:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }
    }
}
