package C4;

public class Artículo {
    public static double IVA = 21;
    private String nombre;
    private double precioSinIVA;
    public static int cuantosQuedan;
    public static void setCuantosQuedan(int cuantosQuedan) {
        Artículo.cuantosQuedan = cuantosQuedan;
    }
    public static int getCuantosQuedan() {
        return cuantosQuedan;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecioSinIVA(Double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }
    public double getPrecioSinIVA() {
        return precioSinIVA;
    }
}
