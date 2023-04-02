package ArrayAsignaturas;

/**
 * Ignacio Pérez Pose
 */
public class Asignaturas {
    private String nombre;
    private int codigoNumerico,curso;

    public Asignaturas(String nombre,int codigoNumerico, int curso){
        this.nombre = nombre;
        this.codigoNumerico = codigoNumerico;
        this.curso = curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public Asignaturas(){
        
    }
    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }
    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    public int getCurso() {
        return curso;
    }

    public void imprimeCurso(){
        System.out.println(this.nombre + " código " + this.codigoNumerico + " clase " + this.curso);
    }
}