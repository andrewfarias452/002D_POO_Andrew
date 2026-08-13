public class Canil {
    public static void main(String[] args) {
        System.out.println("Bienvenido al canil");

        Perro perro1 = new Perro();
        perro1.nombre = "Mailo";
        perro1.edad = 4;
        perro1.peso = 27;
        perro1.raza = "labrador";
        perro1.vacuna = true;

        if (perro1.edad > 2) {
            System.out.println(perro1.nombre + " tiene mas de 2 años, es un perro adulto, tiene: " + perro1.edad + " años");
        } else {
            System.out.println(perro1.nombre + " no tiene mas de 2 años, es un cachorro, tiene: " + perro1.edad + " años");
        }

        if (perro1.peso > 20) {
            System.out.println(perro1.nombre + " es un perro guaton, pesa: " + perro1.peso + " kg");
        } else {
            System.out.println(perro1.nombre + " es un perro ligero, pesa: " + perro1.peso + " kg");
        }
        if (perro1.vacuna) {
            System.out.println(perro1.nombre + " está vacunado");
        } else {
            System.out.println(perro1.nombre + " no está vacunado");
        }
        if (perro1.vacuna == true) {
            System.out.println(perro1.nombre + " está vacunado. Puede ingresar al Canil");
        } else {
            System.out.println(perro1.nombre + " no está vacunado. No puede ingresar al Canil");
        }

        System.out.println("Gracias por visitar nuestro canil");
    }
}
