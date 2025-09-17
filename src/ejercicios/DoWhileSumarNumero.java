package ejercicios;

import java.util.Scanner;
public class DoWhileSumarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;
        do {


            System.out.println("Ingresar número 1:");
            double num1 = scanner.nextDouble();

            System.out.println("Ingresar número2");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("la suma es " + sum);

            System.out.println("¿le gustaria continuar? Si(true) o No(false)?");
            continuar = scanner.nextBoolean();

        } while (continuar);

        scanner.close();


    }
}
