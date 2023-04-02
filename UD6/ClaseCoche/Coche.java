
package ClaseCoche;

/**
 * Ignacio Pérez Pose
 */
public class Coche {
    //Atributos
    private String modelo,color,tipoPintura,matricula;
    private int añoFabricacion;
    private tipoCoche TipoCoche;
    private modalidadSeguro ModalidadSeguro;

    public enum tipoCoche {mini,utilitario,familiar,deportivo};
    public enum modalidadSeguro{terceros,todoRiesgo};

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    
    public void setTipoPintura(String pintura){
        this.tipoPintura = pintura;
    }
    public String getTipoPintura(){
        return this.tipoPintura;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public void setAñoFabric(int año){
        this.añoFabricacion = año;
    }
    public int getAñoFabric(){
        return this.añoFabricacion;
    }
   
    public void setModalidadSeguro(modalidadSeguro modalidadSeguro) {
        ModalidadSeguro = modalidadSeguro;
    }
    public modalidadSeguro getModalidadSeguro() {
        return ModalidadSeguro;
    }
    public void setTipoCoche(tipoCoche tipoCoche) {
        TipoCoche = tipoCoche;
    }
    public tipoCoche getTipoCoche() {
        return TipoCoche;
    }

    public Coche(String modelo,String color,String pintura, tipoCoche tipo , int añoFabricacion,modalidadSeguro seguro){
        this.modelo = modelo;
        this.color = color;
        this.tipoPintura = pintura;
        this.TipoCoche =tipo;
        this.añoFabricacion = añoFabricacion;
        this.ModalidadSeguro = seguro;
    }
}