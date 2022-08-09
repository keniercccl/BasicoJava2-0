import java.util.Scanner;

public class EjerciciosMetodos {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int opcion = 1;

        while(opcion != 0){
            System.out.println("Que operacion deseas realizar");
            System.out.println("0.- Salir");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            opcion = cap.nextInt();

            System.out.println("ingrese primer numero 1");
            int numA = cap.nextInt();

            System.out.println("ingrese primer numero 2");
            int numB = cap.nextInt();

            if (opcion == 1){
                System.out.println("tu suma es: "+ sumando(numA, numB));
            } else if (opcion == 2) {
                System.out.println("tu suma es: "+ restando(numA, numB));
            } else if (opcion == 3) {
                System.out.println("tu suma es: "+ multiplicar(numA, numB));
            } else if (opcion == 4) {
                System.out.println("tu suma es: "+ dividir(numA, numB));
            } else {
                System.out.println("no eligio una opcion valida");
            }
        }
    }

    public static int sumando(int a, int b){
        return a+b;
    }

    public static int restando(int a, int b){
        return a-b;
    }

    public static int multiplicar(int a, int b){
        return a*b;
    }

    public static int dividir(int a, int b){
        return a/b;
    }

}
