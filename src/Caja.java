import java.util.Scanner;

public class Caja {
    public static void main(String[] args){
        // Obtener el numero de elementos para escanear
        System.out.print("Obtener el numero de elementos: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double total = 0;

        // crea un ciclo para recorrer todos los articulos y acumular los costos
        for (int i=0; i<n; i++){
            System.out.println("ingrese el costo del articulo:");
            double price =
                    sc.nextDouble();
            //Falta el calculo
            total =total+price;
        }
        System.out.println("La suma total es: " +total);
        sc.close();
    }
}