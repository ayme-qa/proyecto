package ejercicios;

import java.util.Scanner;

public class FactorialWhile {
    public static  void main(String[] arg) {
        System.out.println("Ingresa el numero a calcular: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        //4! = 1*2*3*4 ; 5! 1*2*3*4*5
        int factorial = 1; //factorial se inicializa a 1
        int i = 1; // el valor inicial de i es 1
        while ((i <= numero)) {
            factorial = factorial*i;
            i = i +1;
        }
        System.out.println("El factorial de "+numero+" es " + factorial);
    }
}
