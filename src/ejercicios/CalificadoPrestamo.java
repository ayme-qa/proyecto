package ejercicios;

import java.util.Scanner;

public class CalificadoPrestamo {
    public static void main(String[] args) {
        //Inicializar los valores por defecto S/ 3000 y 2 años
        int salarioRequerido=3000;
        int tiempoRequerido=2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el Salario del empleado");
        double salario = scanner.nextDouble();
        System.out.println("Ingresar el tiempo del trabajador");
        double tiempotrabajado= scanner.nextDouble();

        scanner.close();
        if((salario>=salarioRequerido) && (tiempotrabajado>=tiempoRequerido)) {
            System.out.println("Calificas al prestamo");

        }

             else {
                System.out.println("No cumple las condiciones al prestamo");
            }

        }

        //Leer por pantalla el salario del empleado


        //Leer el numero de año trabajados


        //Tomar la decision aplicando condicional y mostrar si califica o no

    }





