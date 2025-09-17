import java.util.Scanner;

public class CambioPorUnJuegoSol {
    public static void main(String[] args) {
        double unCentimo = 0.01;
        double cincoCentimo = 0.05;
        double diezCentimo = 0.10;
        double veinteCincoCentimo = 0.25;

        int sol = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a 'Cambio por un sol'!" +
            "Su meta es ingresar suficiente cambio para hacer exactamente s/1.00");

                    System.out.println("ingresar sus monedas de un centimo: ");
                    int numMonedasunCentimo = scanner.nextInt();

                    System.out.println("ingresar sus monedas de cinco centimo: ");
                    int numMonedaCincoCentimo = scanner.nextInt();

                    System.out.println("ingresar sus monedas de Diez centimo: ");
                    int numMonedaDiezCentimo = scanner.nextInt();

                     System.out.println("ingresar sus monedas de 25 centimo: ");
                     int numMonedaveinteCincoCentimo = scanner.nextInt();
                     scanner.close();
                     double total = numMonedasunCentimo*unCentimo + numMonedaCincoCentimo*cincoCentimo +
                             numMonedaDiezCentimo*diezCentimo + numMonedaveinteCincoCentimo*veinteCincoCentimo;
                     if (total < sol) {
                         double montoFaltante = sol - total;
                         System.out.println("Lo siento, perdiste! Te falta " + montoFaltante + "centimos.");
                     }
                         else if(total > sol){
                             double montoExcedido = total - sol;
                             System.out.println("Lo siento perdiste! Te excediste " + String.format("%.2f",montoExcedido)+ " centimos.");
                         }
                         else{
    System.out.println("Muy bien! ¡Es exactamente s/1.00 ! ¡Ganaste!!!");
                                              }
                     }
    }

