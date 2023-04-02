package C1;
/*
 * Ignacio Pérez Pose
 */
public class principal {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Punto p3 = new Punto();
        p1.setX(5);
        p1.setY(0);
        
        p2.setX(10);
        p2.setY(10);
        
        p3.setX(-3);
        p3.setY(7);

        System.out.println("La coordenada x de p1 es " + p1.getX());
        System.out.println("La coordenada y de p1 es " + p1.getY());

        System.out.println("La coordenada x de p2 es " + p2.getX());
        System.out.println("La coordenada y de p2 es " + p2.getY());

        System.out.println("La coordenada x de p3 es " + p3.getX());
        System.out.println("La coordenada y de p3 es " + p3.getY());
    }
}
