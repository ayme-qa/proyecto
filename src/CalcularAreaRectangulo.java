public class CalcularAreaRectangulo {

    public static void main(String[] arg){

        /***Rectangulo 1** */
        //Crear instancia de Rectangulo 1
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setAncho(25);
        rectangulo1.setLargo(50);

        double areaRectangulo1 = rectangulo1.calcularArea();
        double perimetroRectangulo1 = rectangulo1.calcularPerimetro();

        System.out.println("El area del rectangulo 1 es: " +areaRectangulo1);
        System.out.println("El perimetro del rectangulo 1 es " +perimetroRectangulo1);


        Rectangulo rectangulo2 = new Rectangulo(20,10);
        double areaRectangulo2 = rectangulo2.calcularArea();
        double perimetroRectangulo2 = rectangulo2.calcularPerimetro();

        System.out.println("El area del rectangulo 2 es: " +areaRectangulo2);
        System.out.println("El perimetro del rectangulo 2 es " +perimetroRectangulo2);




        double areaTotal = areaRectangulo1+areaRectangulo2;
      double perimetroTotal = perimetroRectangulo1+perimetroRectangulo2;
        System.out.println("El area del rectangulo 1+rectangulo 2 es: " + areaTotal);
        System.out.println("El perimetro del rectangulo 1 + rectangulo 2 es " + perimetroTotal);





    }

}

