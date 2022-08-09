import java.util.Scanner;

public class EjerciciosInOut {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("¿cual es tu nombre?");
        String name = cap.next();

        System.out.println("Jarvis: bienvenido "+ name);
    }
}
