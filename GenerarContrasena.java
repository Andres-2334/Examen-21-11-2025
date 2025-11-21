import java.util.Scanner;

public class GenerarContrasena {

    public static void numeroSuerte(String nombre, String ciudad, int numeroLuck){
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce tu nombre: ");
        nombre = sc.nextLine();
         if (nombre.length() < 3){
            System.out.println("Error introduce un nombre mas largo");
            return;
        }
        System.out.print("introduce tu ciudad: ");
        ciudad = sc.nextLine();
        System.out.print("Introduce tu numero de la suerte: ");
        numeroLuck = sc.nextInt();
        String contrasena = nombre.substring(0, 3) + numeroLuck + ciudad.substring(ciudad.length() - 2, ciudad.length() );
        System.out.println(contrasena);
       
        
    }
    public static void main(String[] args) {
        numeroSuerte(null, null, 0);
    }
}
