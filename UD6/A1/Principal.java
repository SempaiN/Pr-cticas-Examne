package A1;
public class Principal {
    public static void main(String[] args) {
        Punto P1 = new Punto();
        Punto P2 = new Punto();
        Punto P3 = new Punto();
        
        P1.x=5;
        P1.y=0;
        
        P2.x=10;
        P2.y=10;
        
        P3.x=-3;
        P3.y=7;

        System.out.println("("+P1.x+","+P1.y+")");
        System.out.println("("+P2.x+","+P2.y+")");
        System.out.println("("+P3 .x+","+P3.y+")");
    }
}
