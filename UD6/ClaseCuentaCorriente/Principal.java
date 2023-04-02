package ClaseCuentaCorriente;

public class Principal {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(2, 22);
        c1.retirarDinero(22);
        c1.muestraCuenta();
    }
}
