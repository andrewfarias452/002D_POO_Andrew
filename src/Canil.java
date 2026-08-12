public class Canil {

    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();

        perro1.nombre = "Max";
        perro1.raza = "Labrador";
        perro1.edad = 3;
        perro1.peso = 25.5;
        perro1.vacuna = true;

        perro2.nombre = "Bella";
        perro2.raza = "Golden Retriever";
        perro2.edad = 2;
        perro2.peso = 30.0;
        perro2.vacuna = false;

        perro3.nombre = "Rocky";
        perro3.raza = "Bulldog";
        perro3.edad = 4;
        perro3.peso = 20.0;
        perro3.vacuna = true;

        String ladrido1 = perro2.ladrar();

        System.out.println(perro1.nombre + " ingresado al canil");
        System.out.println(perro2.nombre + " ingresado al canil");
        System.out.println(ladrido1);
        System.out.println(perro3.nombre + " ingresado al canil");
        
        

    }
}
