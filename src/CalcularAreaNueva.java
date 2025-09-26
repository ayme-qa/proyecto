/* Escribamos una clase "CalcularAreaNueva" que calcule el area de un baño y una cocina y muestre en pantalla el area total de las habitaciones.
La clase debe tener un metodo que me devuelva un rectangulo y otro metodo que calcula el area total del baño y cocina este metodo debe recibir como parametro dos rectangulos.
*/

import java.util.Scanner;


public class CalcularAreaNueva {

    static Scanner scanner = new Scanner(System.in);

    public  static  void main(String[] args) {

        CalcularAreaNueva areaNueva = new CalcularAreaNueva();

        Rectangulo cocina = areaNueva.getRectangulo("cocina");
        Rectangulo bano = areaNueva.getRectangulo("baño");
        double areaTotal = areaNueva.calcularAreaTotal(cocina, bano);
        System.out.println("El area total es: " + areaTotal);
        scanner.close();

    }
    public Rectangulo getRectangulo(String descripcion){
        System.out.println("Ingrese el largo de " +descripcion);
        double largo = scanner.nextDouble();
        System.out.println("Ingrese el ancho del " +descripcion);
        double ancho = scanner.nextDouble();

        return new Rectangulo(largo, ancho);


    }
       /*Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(20);
        rectangulo.setLargo(10);*/


    public double calcularAreaTotal(Rectangulo rectangulo1, Rectangulo rectangulo2) {
        double areaTotal = rectangulo1.calcularArea() + rectangulo2.calcularArea();
        return areaTotal;
    }

}
