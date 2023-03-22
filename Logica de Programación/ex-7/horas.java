import java.util.Scanner;

public class horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
        String diaInput = scanner.nextLine().toLowerCase();

        int minutosDia = 1440; // cantidad de minutos en un día
        int minutosHora = 60; // cantidad de minutos en una hora

        int minutosHastaViernes = 0;
        switch (diaInput) {
            case "lunes":
                minutosHastaViernes = 4 * minutosDia;
                break;
            case "martes":
                minutosHastaViernes = 3 * minutosDia + 1 * minutosHora;
                break;
            case "miércoles":
                minutosHastaViernes = 2 * minutosDia + 2 * minutosHora;
                break;
            case "jueves":
                minutosHastaViernes = 1 * minutosDia + 3 * minutosHora;
                break;
            case "viernes":
                minutosHastaViernes = 15 * minutosHora;
                break;
            default:
                System.out.println("El día ingresado no es válido.");
                return;
        }

        System.out.print("Ingrese una hora (horas y minutos): ");
        String horaInput = scanner.nextLine();
        String[] horaMinutos = horaInput.split(":");
        int horas = Integer.parseInt(horaMinutos[0]);
        int minutos = Integer.parseInt(horaMinutos[1]);

        int minutosIngresados = horas * minutosHora + minutos;

        int minutosHastaFinSemana = minutosHastaViernes - minutosIngresados;

        if (minutosHastaFinSemana < 0) {
            System.out.println("Ya es fin de semana!");
        } else {
            System.out.println("Faltan " + minutosHastaFinSemana + " minutos para el fin de semana");
        }
    }
}
