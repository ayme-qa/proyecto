import java.util.Scanner;

public class Saludos {
    public static void main(String[] args) {
        System.out.printf("Ingrese su nombre:");
        Scanner scanner = new Scanner (System.in);
        String name = scanner.next();
        scanner.close();
        saludarUsuario(name);
        String mensaje = obtenerMensaje(name);
        System.out.printf(mensaje);

    }

    public static void saludarUsuario(String name){
        System.out.println("Hola, "+name+ " ¿Como estas?");

    }
public static String obtenerMensaje(String name){
        String mensaje = "Bienvenido, "+name;
        return mensaje;
}
}

