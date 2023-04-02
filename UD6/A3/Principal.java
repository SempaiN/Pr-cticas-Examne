package A3;

public class Principal {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        int altura,base,perimetro,area;

        r1.x1=0;
        r1.y1=0;
        r1.x2=5;
        r1.y2=5;

        r2.x1=7;
        r2.y1=9;
        r2.x2=2;
        r2.y2=3;

        altura = r1.y2-r1.y1;
        base = r1.x2-r1.x1;
        perimetro = 2*base+2*altura;
        area = altura*base;
        System.out.println("(" + r1.x1+"," + r1.y1+")" + "("+r1.x2+","+r1.y2+")" + " el périmetro es " + perimetro + " el area es " + area);
        
        System.out.println();
 
        altura = r2.y1-r2.y2;
        base = r2.x1-r2.x2;
        perimetro = 2*base+2*altura;
        area = altura*base;
        System.out.println("(" + r2.x1+"," + r2.y1+")" + "("+r2.x2+","+r2.y2+")" + " el périmetro es " + perimetro + " el area es " + area);
    }
}
