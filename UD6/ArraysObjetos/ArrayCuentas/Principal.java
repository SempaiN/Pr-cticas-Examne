package ArrayCuentas;

import java.util.Scanner;

public class Principal {
    public static Cuenta cuentas [] = new Cuenta[5];
    public static Scanner lec = new Scanner(System.in);
    public static void main(String[] args) {
        cuentas[0] = new Cuenta(1, 2021);
        cuentas[1] = new Cuenta(2, 2020);
        cuentas[2] = new Cuenta(3, 41);
        cuentas[3] = new Cuenta(4, 9999);
        cuentas[4] = new Cuenta(5, 2.5);
        do {
            menu(opc());
        } while (true);
    }
    public static int opc(){
        System.out.println("Dame la opción");
        int opc = lec.nextInt();
        return opc;

    }

    public static void menu(int opc){
        switch (opc) {
            case 1:
                verCuentas();
                break;
            case 2:
                ingresarDin();
                break;
            case 3:
                retirarDin();
                break;
            case 4:
                transferirDinero();
                break;
            case 5:
                System.exit(0);
                break;
                
            default:
                break;
        }
    }
    public static void verCuentas(){
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i].getNumCuenta() + " Saldo:" + cuentas[i].getSaldo());
        }
    }
    public static void ingresarDin(){
        System.out.println("Dime el número de cuenta al que vas a ingresar");
        int ncuenta = lec.nextInt();
        System.out.println("Ahora dame la cantidad a ingresar");
        double dinero = lec.nextDouble();
        cuentas[ncuenta].ingresarDinero(dinero);

    }
    public static void retirarDin(){
        System.out.println("Dime el número de cuenta al que vas a retirar");
        int ncuenta = lec.nextInt();
        System.out.println("Ahora dame la cantidad a retirar");
        double dinero = lec.nextDouble();
        cuentas[ncuenta].retirarDinero(dinero);
    }

    public static void transferirDinero(){
        System.out.println("Dame el origen del dinero");
        int origen = lec.nextInt();
        System.out.println("Dame el dinero a transferir");
        double dinero= lec.nextDouble();
        System.out.println("Ahora el destinatario");
        int destino = lec.nextInt();
        cuentas[destino].ingresarDinero(dinero);
        cuentas[origen].retirarDinero(dinero);
    }
}
