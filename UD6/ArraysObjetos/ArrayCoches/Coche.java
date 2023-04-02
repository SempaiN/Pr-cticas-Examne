package ArrayCoches;

public class Coche {
    public enum tipoCoche{mini,utilitario,familiar,deportivo};
    public enum tipoSeguro{tercero,todoRiesgo};
    
    public static int metalizados = 0;
    public static int viejos = 0;
    public static int terceros = 0;
    public static int riesgo = 0;

    private String modelo,color,matricula;

    private int añoFabricacion;
    private boolean esMetalizado;
    private tipoCoche tipoC;
    private tipoSeguro tipoS;

    public Coche(String modelo,String color,boolean metal,String matricula, tipoCoche tipo, int año, tipoSeguro seguro ){
        this.modelo=modelo;
        this.color = color;
        this.esMetalizado = metal;
        this.matricula = matricula;
        this.tipoC = tipo;
        this.añoFabricacion = año;
        this.tipoS = seguro;
    }

    public Coche(){
        
    }
    public void setEsMetalizado(boolean esMetalizado) {
        this.esMetalizado = esMetalizado;
    }
    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setTipoC(int tipo) {
        switch (tipo) {
            case 0:
                this.tipoC = tipoCoche.mini;
                break;
            case 1:
                this.tipoC = tipoCoche.utilitario;
                break;
            case 2:
                this.tipoC = tipoCoche.familiar;
                break;
            case 3:
                this.tipoC = tipoCoche.deportivo;        
            default:
                break;
        }
    }
    public void setTipoS(int tipo) {
        switch (tipo) {
            case 0:
                this.tipoS = tipoSeguro.tercero;
                break;
            case 1:
                this.tipoS = tipoSeguro.todoRiesgo;
            default:
                break;
        }
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    public String getColor() {
        return color;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public tipoCoche getTipoC() {
        return tipoC;
    }
    public tipoSeguro getTipoS() {
        return tipoS;
    }
    public boolean getMetal(){
        return this.esMetalizado;
    }

    public void imprimeCoche(){
        System.out.println(getModelo() + " " + getColor() + " " +getMetal() + " " + getTipoC() + " " + getAñoFabricacion() + " " + getTipoS());
    }
    public int sumaMetalizados(){
        if (!getMetal()) {
            metalizados++;
        }
        return metalizados;
    }
    public int contViejos(){
        if (getAñoFabricacion() < 2000) {
            viejos++;
        }
        return viejos;
    }
    public int contTerceros(){
        if (getTipoS().equals(tipoSeguro.tercero)) {
            terceros++;
        }
        return terceros;
    }
    public int contRiesgo(){
        if (getTipoS().equals(tipoSeguro.todoRiesgo)) {
            riesgo++;
        }
        return riesgo;
    }
}
