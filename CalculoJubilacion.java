import java.util.Scanner;

public class CalculoJubilacion {

    public static void calcula(){
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce tu edad actual: ");
        int edadActual = sc.nextInt();
        System.out.print("introduce tu edad de jubilación: ");
        int edadJubilacion = sc.nextInt();
        if (edadJubilacion < edadActual){
            System.out.println("Error la edad de jubilación es menor a la edad actual");
            
        }else if(edadJubilacion >= edadActual){
            System.out.println("Ya has alcanzado la edad de jubilación");
        }
        else{
        System.out.println("faltan " + (edadJubilacion - edadActual) + " años para tu jubilación");
        }
    }

public static void main(String[] args) {
    calcula();
}
}
