package ClaseReloj;

public class Principal {
    public static void main(String[] args) {
        Reloj r1 = new Reloj(22, 20, 59);
        System.out.println();
        r1.imprimeHora();
        r1.imprimeHora12();
        r1.tick();
        System.out.println();
        r1.imprimeHora();
        r1.imprimeHora12();

    }   
}
