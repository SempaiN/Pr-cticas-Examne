package A2;

public class Principal {
public static void main(String[] args) {
    Persona p1 = new Persona();
    Persona p2 = new Persona();
    
    p1.nombre = "Juanlu";
    p1.apellido= "Gómez García";
    p1.dni="2438990L";
    p1.edad=35;

    p2.nombre = "Rodrigo";
    p2.apellido = "Pérez";
    p2.dni = "1337505S";
    p2.edad = 15;

    System.out.print(p1.nombre + " " + p1.apellido+ " con DNI " + p1.dni + " ");
    if (p1.edad>= 18) {
        System.out.println("es mayor de edad");
    }
    else{
        System.out.println("no es mayor de edad");
    }
    
    System.out.println();

    System.out.print(p2.nombre + " " + p2.apellido+ " con DNI " + p2.dni + " ");
    if (p2.edad>= 18) {
        System.out.println("es mayor de edad");
    }
    else{
        System.out.println("no es mayor de edad");
    }
}
}
