import java.util.Scanner;

public class RegistroDeUsuarios {
    public static void main(String[] args) {
        // Se crea el objeto Scanner para leer desde el teclado (System.in)
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE REGISTRO DE USUARIOS ===");

        // 1. Lectura de Texto (String)
        System.out.print("Ingrese el nombre completo del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el correo electrónico: ");
        String email = scanner.nextLine();

        // 2. Lectura de un número entero (int)
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        // 3. Lectura de un valor booleano (boolean)
        System.out.print("¿El usuario está activo? (true/false): ");
        boolean esActivo = scanner.nextBoolean();

        // Limpiar el búfer (recomendado si más adelante se quisiera volver a usar nextLine)
        scanner.nextLine(); 

        // Mostrar el resumen del registro
        System.out.println("\n------------------------------------");
        System.out.println("     REGISTRO COMPLETADO CON ÉXITO   ");
        System.out.println("------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + email);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estado: " + (esActivo ? "Activo" : "Inactivo"));
        System.out.println("------------------------------------");

        // Buena práctica: Cerrar el Scanner al finalizar
        scanner.close();
    }
}