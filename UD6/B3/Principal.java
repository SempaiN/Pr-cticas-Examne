package B3;

public class Principal {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(7, 9, 2, 2);
        
        double altura = r1.y2-r1.y1;
        double base = r1.x2-r1.x1;
        double perimetro = 2*base+2*altura;
        double area = altura*base;
        
        if (r1.x1 < r1.x2 && r1.y1 < r1.y2) {
            System.out.println("(" + r1.x1+"," + r1.y1+")" + "("+r1.x2+","+r1.y2+")" + " el périmetro es " + perimetro + " el area es " + area);
        }
        else {
            System.out.println( "ERROR");
        }
        
        System.out.println();

        altura = r2.y2-r2.y1;
        base = r2.x2-r2.x1;
        perimetro = 2*base+2*altura;
        area = altura*base;

        if (r2.x1 < r2.x2 && r2.y1 < r2.y2) {
            System.out.println("(" + r2.x1+"," + r2.y1+")" + "("+r2.x2+","+r2.y2+")" + " el périmetro es " + perimetro + " el area es " + area);
        }
        else {
            System.out.println( "ERROR");
        }
    }
}
