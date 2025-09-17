package ejercicios;

import java.util.Scanner;

/*

Todos los vendedores reciben un pago de S/1000 por semana
los vendedores que superen las 10 ventas obtuvienen un bono adicional de S/250
 */
public class CalculadoraSalarioConBono {

    public static void main(String arg[]){
        // Inicializar las variables con valores conocidos
        int salario = 1000;
        int bono = 250;
        int cuotaVentas = 10;

        //obtener el numero de ventas de empleado
        System.out.println( "Cuantas ventas hizo el empleado en esta semana?");
        Scanner scanner = new Scanner( System.in);
        int ventas = scanner.nextInt();
        scanner.close();

        //Comparar quienes superan las ventas
        if (ventas >=cuotaVentas){
            salario = salario + bono;
        }

        //Resultado
        System.out.println("El pago del empleado es S/"+ salario);
    }
}
