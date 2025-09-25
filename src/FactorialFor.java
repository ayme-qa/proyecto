import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args){
        System.out.print("Ingresa el número a calcular: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int factorial =1 ;// factorial se inicializa a 1
        sc.close();
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es " + factorial);
    }
}
