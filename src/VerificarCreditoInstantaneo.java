/*
* Alcance de variable
* Escriba un programa de "verificacion de crédito instantánea" que apruebe
* cualquier persona que gane más de s/ 2,500 y tenga un score de crédito
* de 700 o mejor .Rechaza a todos los demás.

 */


import java.util.Scanner;

public class VerificarCreditoInstantaneo {
    //Declarar variables
    static  int salarioRequerido = 2500;
    static int scoreCrediticioRequerido = 700;

    static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        // Obtener el salario (crear un metodo)
        double salario = getSalario();
        // Obtener el score crediticio
        int scoreCrediticio = getScoreCrediticio();

        //verificar si el usuario califica (crear otro metodo)
        boolean esCalificado = esUsuarioCalificado(scoreCrediticio, salario);

        //Notificar al usuario si califica o no
        notificarUsuario(esCalificado);

    }
    public static double getSalario(){
        System.out.println("Ingresar salario");
        double salario = scanner.nextDouble();
        return salario;

    }
    public static int getScoreCrediticio(){
        System.out.println("Ingresar su score crediticio");
        int scoreCrediticio = scanner.nextInt();
       return scoreCrediticio;

    }
    public static boolean esUsuarioCalificado (int scoreCrediticio, double salario){
       if (scoreCrediticio >= scoreCrediticioRequerido && salario >= salarioRequerido) {
           return true;

       } else{
            return  false;
           }
    }


    public static void  notificarUsuario(boolean esCalificado){
       if (esCalificado){
           System.out.printf("Felicitaciones! Su credito esta aprobado");
       }
       else {
           System.out.println("Lo sentimos. Su crédito no esta aprobado");
       }
    }

}

