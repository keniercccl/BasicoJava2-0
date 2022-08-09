import java.util.Scanner;

public class EjercicioCondicional {

    public static void main(String[] args) {

        Scanner cap = new Scanner(System.in);

        System.out.println("Bienvenido al cabaret");
        System.out.println("¿cual es tu nombre?");
        String name = cap.next();

        System.out.println("Indique su edad");
        int age = cap.nextInt();

        if (age >= 40){
            System.out.println(name +" va al area VIP");
        }else if (age < 40 && age > 18) {
            System.out.println(name +" Va al area adulto");
        }else {
            System.out.println(name +" es menor, no puede entrar");
        }
    }
}
