package B4;

public class Articulo {
    String nombre;
    double precioConIVA,precioSinIVA;
    double iva = 1.21;
    int cuantosQuedan;
    public Articulo(String Nom,double precio,int cuantos){
        this.nombre = Nom;
        this.precioSinIVA = precio;
        this.cuantosQuedan = cuantos;
    }
    
}
