import java.util.Scanner;

public class RegistroDeUsuarios {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE REGISTRO DE USUARIOS ===");

        
        System.out.print("Ingrese el nombre completo del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el correo electrónico: ");
        String email = scanner.nextLine();

        
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        
        System.out.print("¿El usuario está activo? (true/false): ");
        boolean esActivo = scanner.nextBoolean();

        
        scanner.nextLine(); 

        
        System.out.println("\n------------------------------------");
        System.out.println("     REGISTRO COMPLETADO CON ÉXITO   ");
        System.out.println("------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + email);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estado: " + (esActivo ? "Activo" : "Inactivo"));
        System.out.println("------------------------------------");

        
        scanner.close();
    }
}