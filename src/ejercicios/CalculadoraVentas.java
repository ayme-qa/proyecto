package ejercicios;


import java.util.Scanner;

/*
IF ELSE
*Se espera que todos los vendedores realicen al menos 10 ventas por semana
*Para aquellos que lo hacen, reciben un mensaje de felicitacion.
*Para aquellos que no lo hacen , se les informa cuantas ventas les faltaron
 */
public class CalculadoraVentas {
    public static void main(String [] args){
        //Inicializar los valores que se conocen
        int cuotaVenta = 10;
        System.out.println("Ingresar el numero de ventas que realizo esta semana");
        Scanner scanner = new Scanner(System.in);
        int ventas = scanner.nextInt();
        scanner.close ();

        //Realizar la comparacion
        // Se espera que todos los vendedores realicen al menos 10 ventas por semana
        if(ventas >=cuotaVenta){
            System.out.println("Felicitaciones! Usted llegó a la meta de ventas.");
        }
        //Para aquellos que no lo hacen, se les informa cuantas ventas les faltaron
        else{
            int ventasFaltantes = cuotaVenta - ventas;
            System.out.println("Lo sentimos no llego a la meta de ventas. Le faltaron:"+ventasFaltantes+ " ventas");
        }
    }
}
