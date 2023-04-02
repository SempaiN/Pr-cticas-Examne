package ClaseReloj;

public class Reloj {
    private int hora, minuto, segundo;

    public Reloj(int hora, int minuto, int segundo) {
        if((hora <= 23 && hora >= 0) && (minuto >= 0 && minuto <= 59)&&(segundo >= 0 && segundo <= 59)){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
        else{
            System.out.println("Hora total incorrecta");
        }

        
    }

    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void setHora(int hora) {
        if (hora <= 23 && hora >= 0) {
            this.hora = hora;    
        }
        else{
            System.out.println("Hora incorrecta");
        }
        
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        if (minuto <= 59 && minuto >= 0) {
            this.minuto = minuto;    
        }
        else{
            System.out.println("Minuto introducido incorrecto");
        }
        
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo <= 59 && segundo >= 0) {
            this.segundo = segundo;    
        }
        else{
            System.out.println("Minuto introducido incorrecto");
        }
        
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setReloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String dimeHora() {
        return (this.hora+":"+this.minuto+":"+this.segundo);
    }

    public String dimeHora12() {
        if (this.hora < 12) {
            return (this.hora+":"+this.minuto+":"+this.segundo);
        }
        else{
            return (this.hora-12+"pm:"+this.minuto+":"+this.segundo);
        }
    }

    public void imprimeHora(){
        System.out.println(dimeHora()); 
    }
    
    public void imprimeHora12(){
        System.out.println(dimeHora12());
    }
    
    public void tick(){
        if (segundo < 59) {
            segundo++;
        }
        if (segundo == 59) {
            segundo = 0;
            if (minuto < 59) {
                minuto++;
            }
            if (minuto == 59) {
                minuto = 0;
                if (hora < 23) {
                    hora ++;
                }
                if (hora == 23) {
                    hora = 0;
                }

            }
        }
    }

}
