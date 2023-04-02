package ArrayReloj;

public class Reloj {
    private int horas,minutos,segundos;
    
    public Reloj(){
        setHora(0);
        setMinutos(0);
        setSegundos(0);
    }

    public Reloj(int hora,int minuto,int segundo){
        setHora(hora);
        setMinutos(minuto);
        setSegundos(segundo);
    }

    public void setHora(int hora){
        if (hora >= 0 && hora <= 23) {
            this.horas = hora;
        }
        else {
            System.out.println("Hora introducida erronea");
        }
    }
    public void setMinutos(int minuto){
        if (minuto >= 0 && minuto <= 59) {
            this.minutos=minuto;
        }
        else{
            System.out.println("Minuto introducido incorrecto");
        }
     }
    public void setSegundos(int segundo){
        if (segundo >= 0 && segundo <= 59) {
            this.segundos=segundo;
        }
        else{
            System.out.println("Segundo introducido incorrecto");
        }
    }

    public int getHora(){
        return this.horas;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public int getSegundos(){
        return this.segundos;
    }
 
    public String dimeHora(){
        return(getHora() + ":" + getMinutos() + ":" + getSegundos());
    }
    public String dimeHora12(){
        if(getHora() > 12){
            return(getHora()-12 + "pm:" + getMinutos() + ":" + getSegundos());
        }
        else{
            return(getHora() + "am:" + getMinutos() + ":" + getSegundos());
        }
    }

    public void imprimeHora(){
        System.out.println(dimeHora());
    }
    public void imprimeHora12(){
        System.out.println(dimeHora12());
    }

    public void tick(){
        if (this.segundos < 59) {
            this.segundos++;
        }
        if (this.segundos == 59) {
            this.segundos = 0;
            if (this.minutos < 59) {
                this.minutos++;
            }
            if (this.minutos == 59) {
                this.minutos = 0;
                if (this.horas< 23) {
                    this.horas ++;
                }
                if (this.horas == 23) {
                    this.horas = 0;
                }

            }
        }
    }
    
    
    


}
