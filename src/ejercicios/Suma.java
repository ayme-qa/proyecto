package ejercicios;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Declara dos numeros enteros
        System.out.println("primer numero:");
        int numero1 = scanner.nextInt();
        //primer numero
        System.out.println("segundo numero:");
        //segundo numero
        int numero2 = scanner.nextInt();
        // Calcular la suma de los dos numeros
        int suma = numero1 + numero2;
        //Se muestra la operacion y el resultado
        System.out.println("La suma es :"+suma);

    }
}
