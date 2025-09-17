package ejercicios;

import java.util.Scanner;

/*
** WHILE LOOP:
* Cada empleado de la tienda gana S/ 15 por hora. Escribe un programa que permita al empleado
* ingresar la cantidad de horas trabajadas por semana.No permita horas extras. (MAX48)
* calcular su pago bruto
/
 */
public class ValidacionEntradaPagoBruto {
    public  static void  main(String[] args) {

        //Inicializar las variables
        int maximoHoras = 48;
        int pagoPorHora = 15;
        //consultar horasTrabajadas en la semana
        System.out.println( "Cuantas horas trabajadas a la semana");
        Scanner scanner  = new Scanner( System.in);
        int horasTrabajadas = scanner.nextInt();


        //validar las horas trabajadas, si no son validas el usuario deberia
        while (horasTrabajadas>maximoHoras){
            System.out.println("Error debe ingresar cantidad de horas validas");
            horasTrabajadas= scanner.nextInt();
        }
        // ingresar nuevamente un valor hasta  que este sea valido.
        scanner.close();
        //calcular pago bruto
        int sueldoBruto = maximoHoras * pagoPorHora;
        //mostrar el pago
        System.out.println( "Su sueldo bruto es " +sueldoBruto);
    }




    }



