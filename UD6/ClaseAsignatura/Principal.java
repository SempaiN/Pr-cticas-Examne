package ClaseAsignatura;

public class Principal {
    public static void main(String[] args) {
        clase c1 = new clase("Historia", 2245, 2);
        clase c2 = new clase("Castellano", 4214, 7);
        c1.imprimeCurso();
        System.out.println();
        c2.imprimeCurso();
    }
}
