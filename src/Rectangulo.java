public class Rectangulo {

    private double largo;
    private double ancho;
    public Rectangulo(){
        this.largo = 0;
        this.ancho = 0;

    }
    public Rectangulo(double largo,double ancho){
        this.largo = largo;   //Forma 1
        setAncho(ancho);     // Forma 2

    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;

    }

public  double getAncho(double ancho){
        return ancho;
}
    public void setAncho(double ancho){
        this.ancho = ancho;

    }
    public  double calcularPerimetro(){
        double perimetro = 0;
        perimetro = (2*largo) + (2*ancho);
        return perimetro;

    }
    public double calcularArea(){
        double area=0;
        area=ancho*largo;
        return area;

    }

    }
