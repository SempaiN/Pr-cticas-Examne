package ClaseAsignatura;

/**
 * Ignacio Pérez Pose
 */
public class clase {
    private String nombre;
    private int codigoNumerico,curso;
    //Setters y getters para el nombre
    public void setNombre(String Curso){
        this.nombre = Curso;
    }
    public String getNombre(){
        return nombre;
    }
    //Setters y getters para el código numérico
    public void setCodigoNumerico(int codigo){
        this.codigoNumerico = codigo;
    }
    public int getCodigoNumerico(){
        return codigoNumerico;
    }
    //Setters y getters para el curso
    public void setCurso(int nCurso){
        this.curso = nCurso;
    }
    public int getCurso(){
        return curso;
    }
    //Constructor para el curso
    public clase(String nombre,int codigoNumerico,int curso){
        this.curso = curso;
        this.codigoNumerico = codigoNumerico;
        this.nombre = nombre;
    }
    //Método para ver cada curso
    public void imprimeCurso(){
        System.out.println(this.nombre + " código " + this.codigoNumerico + " curso " + this.curso);
    }
    
}