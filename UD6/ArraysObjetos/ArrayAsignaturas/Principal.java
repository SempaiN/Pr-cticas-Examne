package ArrayAsignaturas;

public class Principal {
    public static void main(String[] args) {
        Asignaturas clases [] = new Asignaturas[5];
        clases[0] = new Asignaturas("Historia", 24327, 1);
        clases[1] = new Asignaturas("Castellano", 8623, 5);
        clases[2] = new Asignaturas("Matemáticas", 13395, 6);
        clases[3] = new Asignaturas("Fisica", 27135, 2);
        clases[4] = new Asignaturas("Biologia", 12390, 8);
        for (int i = 0; i < clases.length; i++) {
            clases[i].imprimeCurso();
            System.out.println();
        }
    
    }
}