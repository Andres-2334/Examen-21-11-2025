import java.util.Scanner;

public class GenerarContrasena {

    public static void numeroSuerte(String nombre, String ciudad, int numeroLuck) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            while (true) {
            System.out.print("introduce tu nombre: ");
            nombre = sc.nextLine();
            if (nombre.length() < 3) {
                System.out.println("Error introduce un nombre mas largo");
                continue;
            }
            break;
            }

            while (true) {
            System.out.print("introduce tu ciudad: ");
            ciudad = sc.nextLine();
            if(ciudad.length() < 2) {
                System.out.println("Error introduce una ciudad con un nombre mas largo");
                continue;
            }
            break;
        }

            
            System.out.print("Introduce tu numero de la suerte: ");
            numeroLuck = sc.nextInt();
            String contrasena = nombre.substring(0, 3) + numeroLuck
                    + ciudad.substring(ciudad.length() - 2, ciudad.length());
            System.out.println(contrasena);
            break;
        }

    }

    public static void main(String[] args) {
        numeroSuerte(null, null, 0);
    }
}
