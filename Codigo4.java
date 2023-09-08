//se importa el scanner
import java.util.Scanner;

//corregir el nombre del archivo
public class Codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicitar la entrada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        // Solicitar la entrada del jugador 2 y corregir el Scanner
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        // Corregir la comparación de cadenas usando equals
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;

                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;

                default:
                    break;
            }
            // Mostrar quién gana
            System.out.println("Gana el jugador " + g);
        }

        // Cerrar el Scanner
        s.close();
    }
}
