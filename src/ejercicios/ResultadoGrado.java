package ejercicios;

import java.util.Scanner;

/*
   *IF - ELSE-IF
   * Mostrar el grado de un estudiante en funcion a su puntaje
   * en la prueba
   * Si el puntaje es menor a 60 mostramos la letra E
   * Si el puntaje es menor a 70 mostramos la letra D
   * Si el puntaje es menor a 80 mostramos la letra C
   * Si el puntaje es menor a 90 mostramos la letra B
   * Si no se cumple ninguna condicion mostramos la letra A
 */
/*
 */
public class ResultadoGrado {
    public static void main (String args[]){
        //Obtener el resultado por pantalla
        System.out.println("Ingresar el puntaje de la prueba");
        Scanner scanner = new Scanner(System.in);
        double puntaje = scanner.nextDouble();
        scanner.close();
        //Determinar el grado
        char grado;
        if (puntaje < 60){
            grado ='E';
        }
        else if (puntaje < 70){
            grado = 'D';
        }
        else  if (puntaje < 80){
            grado = 'C';

        }
        else if (puntaje < 90){
            grado = 'B';
        }
        else{
            grado = 'A';
        }
        System.out.println("Su grado es: "+grado);
    }
}
