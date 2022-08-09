import java.util.Scanner;

public class EjercicioFor {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);

     /*  for(int i = 0; i <= 2 ; i++){
            System.out.println("Ingresa nombre");

            String name = cap.next();
            System.out.println("¿cual es tu ciudad?");

            String city = cap.next();
        }*/

        int cond = 1;

        while (cond != 0){
            System.out.println("1.- Desea continuar");

            System.out.println("0.- Desea finalizar");

            cond = cap.nextInt();


            ;
        }

    }
}
