package ArrayCuentas;

public class Cuenta {
    private int numCuenta;
    private double saldo;

    public Cuenta(int ncuenta,double dinero){
        setNumCuenta(ncuenta);
        setSaldo(dinero);
    }

    public void setNumCuenta(int ncuenta){
        this.numCuenta = ncuenta;
    }
    public void setSaldo(double dinero){
        if (dinero > 0 ) {
            this.saldo = dinero;
        }
        else{
            System.out.println("Cantidad Erronea");
        }
    }

    public int getNumCuenta(){
        return this.numCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void ingresarDinero(double dinero){
        if (dinero > 0) {
            this.saldo += dinero;
        }
        else{
            System.out.println("Cantidad a introducir incorrecta");
        }
    }

    public boolean retirarDinero(double dinero){
        boolean verda;
        if (dinero > 0) {
            this.saldo-=dinero;
            verda = true;
        }
        else{
            System.out.println("Cantidad a introducir incorrecta");
            verda = false;
        }
        return verda;
    }
}
    
