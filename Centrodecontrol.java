import java.util.Scanner;

public class Centrodecontrol {

    public static void saludo() {
        System.out.println("Hola a todos!");
    }

    public static void descuento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce el precio de un producto: ");
        double descuento = sc.nextDouble();
        if (descuento <= 0) {
            System.out.println("invalido");
            return;
        }
        double descontado = descuento / 10;
        System.out.println("se aplica descuento del 10%: " + descontado);
        System.out.println("el precio descontado es: " + (descuento - descontado));
    }

    public static void temperatura() {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce la temperatura en celcius: ");
        int temp = sc.nextInt();
        if (temp <= 15) {
            System.out.println("hace frio");
        } else if (temp >= 16 && temp <= 25) {
            System.out.println("No hace ni frio ni calor");
        } else if (temp > 25) {
            System.out.println("Hace calor");
        }

    }

    public static void Menu() {
        boolean activacion = true;
        while (activacion) {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "=== CENTRO DE CONTROL === \n1. Mostrar saludo\n2. Calcular descuento \n3. Evaluar temperatura\n4. Salir \nElige una opcion (1-4):");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> saludo();
                case 2 -> descuento();
                case 3 -> temperatura();
                case 4 -> {System.out.println("apagando"); activacion = false;}
                default -> System.out.println("invalido");

            }
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}
