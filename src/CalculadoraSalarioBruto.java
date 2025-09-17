import java.util.Scanner;

public class CalculadoraSalarioBruto{
public static void main (String[] args){
//1.- obtener horas trabajadas
    System.out.println("Ingresar el numero de horas que el empleado ha trabajado");
    Scanner scanner = new Scanner(System.in);
    int horas = scanner.nextInt();

    //2.- Obtener la tarifa de pago por hora
    System.out.println("ingrese la tarifa de pago por hora");
    double tarifa = scanner.nextDouble();

    scanner.close();

    //3.- Calcular el salario
    double salarioBruto = horas * tarifa ;

    //4.- Finalmente  mostramos el resultado
    System.out.println("El salario bruto es : " + salarioBruto);


}
}

