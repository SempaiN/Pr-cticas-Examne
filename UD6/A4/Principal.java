package A4;

public class Principal {
    public static void main(String[] args) {
        Articulo pijama = new Articulo();
        pijama.nombre="Pijama";
        pijama.precioSI = 10;
        pijama.precioCI = pijama.precioSI * pijama.iva;
        System.out.println(pijama.nombre + " - Precio:" + pijama.precioSI + " - IVA:"+pijama.iva+"% - PVP:" + pijama.precioCI );
    }
}
