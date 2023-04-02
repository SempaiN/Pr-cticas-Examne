package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            opc();
        }
        
    }

    public static int menu (){
        System.out.println("\n-- Menú principal --");
            System.out.println("1. Ver cuentas");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Transferencia");
            System.out.println("5. Agregar cuenta");
            System.out.println("6. Eliminar cuenta");
            System.out.println("7. Buscar cuenta");
            System.out.println("8. Mostrar morosos");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");
            int opcion = lector.nextInt();
            return opcion;
    }
    public static void opc(){
        switch (menu()) {
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
                transferirDinero();
                break;
            case 5:
                agregarCuenta();
                break;
            case 6:
                Usuario.eliminarCuenta();
                break;
            case 7:
                Usuario.buscarCuenta();
                break;
            case 8:
                Usuario.buscarMorosos();
                break;
            case 9:
                System.out.println("¡Hasta pronto!");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    public static void verCuentas(){
        if (usuarios.size() == 0) {
            System.out.println("No hay cuentas");
        }
        else{
            for (int i = 0; i <usuarios.size(); i++) {
                System.out.println(i +" "+ usuarios.get(i).getNombre() + " Saldo: " + usuarios.get(i).getSaldo());
            }
        }
    }

    public static double dameDouble(){
        double dienero = lector.nextDouble();
        return dienero;
    } 
    public static int dameInt(){
        int dienero = lector.nextInt();
        return dienero;
    }
    public static String dameString(){
        String palabra = lector.nextLine();
        return palabra;
    }
    public static void ingresarDinero(){
        System.out.println("Elige una cuenta");
        verCuentas();
        int elec = dameInt();
        if (elec >= usuarios.size())  {
            System.out.println("Esa cuenta no existe");
        }
        else{
            System.out.println("Dime el dinero a ingresar");
            double dinero = dameDouble();
            usuarios.get(elec).ingresarDinero(dinero);
        }
        }
        
    public static void retirarDinero(){
        System.out.println("Elige una cuenta");
        verCuentas();
        int elec = lector.nextInt();
        if (elec >= usuarios.size())  {
            System.out.println("Esa cuenta no existe");
        }
        else{
            System.out.println("Dime el dinero a retirar");
            double dinero = lector.nextDouble();
            usuarios.get(elec).retirarDinero(dinero);
        }
    }

    public static void transferirDinero(){
        System.out.println("Dime la cuenta de origen y de destino");
        verCuentas();
        System.out.println("Dime el destino");
        int destino = lector.nextInt();
        System.out.println();
        System.out.println("Ahora el origen");
        int origen = lector.nextInt();
        System.out.println();
        System.out.println("Ahora el dinero que se va a moverº");
        double dinero = lector.nextDouble();
        if (Usuario.transferirDinero(origen, destino, dinero)) {
            usuarios.get(destino).ingresarDinero(dinero);
            usuarios.get(origen).retirarDinero(dinero);
        }
    }

    public static void agregarCuenta(){
        if (usuarios.size() >= 100) {
            System.out.println("No se pueden crear más cuentas");
        }
        else{
            Boolean esta = false;
            lector.nextLine();
            System.out.println("Dame el nombre del usuario");
            String nombre = dameString();
            System.out.println("Ahora dame el saldo");
            double saldo = dameDouble();
            for (int i = 0; i <usuarios.size(); i++) {
                if (usuarios.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                    esta = true;
                }
            }
            if (esta) {
                System.out.println("Esa cuenta ya existe");
            }
            else{
                usuarios.add(new Usuario(nombre, saldo));
            }
        }
    }

    
}
