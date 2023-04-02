package B4;

public class Principal {
    public static void main(String[] args) {
        Articulo a1 = new Articulo("Pijama", 10, 44);
        a1.precioConIVA = a1.precioSinIVA*a1.iva;
        if (a1.precioSinIVA > 0 && a1.cuantosQuedan > 0) {
            System.out.println(a1.nombre + " - Precio:" + a1.precioSinIVA + " - IVA:"+a1.iva+"% - PVP:" + a1.precioConIVA );

        }
        else {
            System.out.println("ERROR");
        }
    }
}
