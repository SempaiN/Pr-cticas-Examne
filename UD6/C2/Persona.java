import java.util.Scanner;

/**
 * Persona
 */
public class Persona {
    static Scanner lectro = new Scanner(System.in);
    private String DNI,nombre,apellido;
    private int edad;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getDNI() {
        return DNI;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String mayorEdad(int edad){
        if (this.edad >= 18) {
            return "es mayor de edad";
        }
        else{
            return "no es mayor de edad";
        }
    }
}