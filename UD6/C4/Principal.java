package C4;

import java.util.Scanner;

public class Principal {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        Artículo pijama = new Artículo();
        pijama.setNombre(pideNombre());
        pijama.setPrecioSinIVA(pidePrecio());
        System.out.println(pijama.getNombre() + " - Precio:" + pijama.getPrecioSinIVA() + "€ - IVA:" +Artículo.IVA+"%" + " - PVP:" + (pijama.getPrecioSinIVA() *((Artículo.IVA / 100)+1))) ;
    }
    public static String pideNombre(){
        System.out.println("Dame el nombre del producto");
        String nombre = lector.next();
        return nombre;
    }
    public static double pidePrecio(){
        System.out.println("Dame el precio del producto");
        int precio = lector.nextInt();
        return precio;
    }

}
