package AppBanco;

import java.util.Scanner;

public class Principal {
    public static Cuenta cuentas[] = new Cuenta[100];
    public static int numCuentas = 2;
    public static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        cuentas[0] = new Cuenta("julio", 20);
        cuentas[1] = new Cuenta("julia", 120);
        do {
            menu(opc());

        } while (!(!true));
    }

    public static int opc() {
        System.out.println("1.- Ver cuentas");
        System.out.println("2.- Ingresar Dinero");
        System.out.println("3.- Retirar Dinero");
        System.out.println("4.- Transferencia");
        System.out.println("5.- Agregar Cuenta");
        System.out.println("6.- Eliminar cuenta");
        System.out.println("7.- Buscar cuenta");
        System.out.println("8.- Mostrar morosos");
        System.out.println("9.- Salir");
        System.out.println("Dame la opción");
        int opc = lector.nextInt();
        return opc;
    }

    public static void menu(int opc) {
        switch (opc) {
            case 1:
                verCuentas();
                break;

            case 2:
                ingresarDinero();
                break;

            case 3:
                retirarDinero();
                break;

            case 4:
                trasferirDinero();
                break;

            case 5:
                agregarCuenta();
                break;

            case 6:
                eliminarCuenta();
                break;

            case 7:
                // buscarCuenta();
                break;

            case 8:
                // mostrarMorosos();
                break;

            case 9:
                System.exit(0);
                break;

            default:
                System.out.println("Esa opción no se encuentra disponible");
                break;
        }
    }

    public static void verCuentas() {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].getNombre()==null) {
                continue;
            }
            else{
                System.out.println(i + " " + cuentas[i].getNombre() + " Saldo:" + cuentas[i].getSaldo() + "€");    
            }
        }
    }

    public static void ingresarDinero() {
        verCuentas();
        System.out.println("Dame la cuenta a la que quieres ingresar");
        int cuenta = lector.nextInt();
        System.out.println("Dame la cantidad a ingresar");
        cuentas[cuenta].ingresarDinero(lector.nextDouble());
    }

    public static void retirarDinero() {
        verCuentas();
        System.out.println("Dame la cuenta a la que quieres retirar");
        int cuenta = lector.nextInt();
        System.out.println("Dame la cantidad a retirar");
        cuentas[cuenta].retirarDinero(lector.nextDouble());
    }

    public static void trasferirDinero() {
        verCuentas();
        System.out.println("Dame la cuenta de origen");
        int origen = lector.nextInt();
        System.out.println("Ahora la cuenta de destinno");
        int destino = lector.nextInt();
        System.out.println("Ahora la cantidad a transferir");
        double dinero = lector.nextDouble();
        if ((cuentas[origen].getSaldo() - dinero) <= -100) {
            System.out.println("No se puede realizar la transferencia");
        } else {
            cuentas[destino].ingresarDinero(dinero);
            cuentas[origen].retirarDinero(dinero);
        }
    }

    public static void agregarCuenta() {
        lector.nextLine();
        boolean exist = false;
        if (numCuentas >= 100) {
            System.out.println("No se pueden crear mas cuentas");
        } else {
            System.out.println("Dame el nombre de la cuenta");
            String nombre = lector.nextLine();
            for (int i = 0; i < cuentas.length; i++) {
                if (cuentas[i] == null) {
                    continue;
                } else if (cuentas[i].getNombre().equals(nombre)) {
                    System.out.println("Esa cuenta ya existe");
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                System.out.println("Dime el saldo de la cuenta");
                double saldo = lector.nextDouble();
                for (int i = 0; i < cuentas.length; i++) {
                    if (cuentas[i] == null) {
                        cuentas[i] = new Cuenta(nombre, saldo);
                        numCuentas++;
                        break;
                    } else {
                        continue;
                    }
                }
            }

        }
    }

    public static void eliminarCuenta(){
        verCuentas();
        System.out.println("Dime la cuenta que quieres eliminar");
        int nCuenta = lector.nextInt();
        if (cuentas[nCuenta] != null) {
            cuentas[nCuenta].setNombre(null);
            cuentas[nCuenta].setSaldo(0);
            
        }
        else{
            System.out.println("Esa cuenta no existe");
        }
    }

}
