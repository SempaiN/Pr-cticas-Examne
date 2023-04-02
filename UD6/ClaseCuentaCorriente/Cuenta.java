package ClaseCuentaCorriente;

public class Cuenta {
    private int nCuenta;
    private double saldo;

    public void setNCuenta (int numcuent){
        this.nCuenta = numcuent;
    }
    public int getNCuenta(){
        return this.nCuenta;
    }

    public void setSaldo(double dinero){
        this.saldo = dinero;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public Cuenta(int numcuent,double dinero){
        if (dinero > 0 ) {
            this.nCuenta = numcuent;
            this.saldo = dinero;    
        }
        else{
            System.out.println("Saldo erroneo");
        }
    }

    public void ingresarDinero(int dinero){
        if (dinero > 0) {
            this.saldo += dinero;
        }
        else{
            System.out.println("Cantidad a ingresar erronea");
        }
    }

    public boolean retirarDinero(int dinero){
        boolean verda = false;
        if (dinero > 0) {
            this.saldo -= dinero;
            verda = true;
        }
        else{
            System.out.println("Cantidad a retirar erronea");
        }
        return verda;
    }

    public void muestraCuenta(){
        System.out.println(this.nCuenta + " " + this.saldo);
    }
}
