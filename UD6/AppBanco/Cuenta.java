package AppBanco;

public class Cuenta {
    private String Nombre;
    private double saldo;

    public Cuenta(String nombre,double dinero){
        this.Nombre = nombre;
        this.saldo = dinero;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double dinero){
        if (dinero > 0) {
            this.saldo += dinero;
        }
        else if (dinero < 0) {
            System.out.println("Cantidad introducida erronea");
        }
    }
    
    public void retirarDinero(double dinero){
        if (dinero > 0 && (this.saldo - dinero) >= -100) {
            System.out.println("Dinero retirado");
            this.saldo -= dinero;
        } else {
            System.out.println("No se puede retirar esa cantidad");
        }
    }
    


}
