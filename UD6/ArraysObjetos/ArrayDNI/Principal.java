package ArrayDNI;

public class Principal {
    public static DNI nifs [] = new DNI[10000];
    public static void main(String[] args) {
        int vocales = 0;
        for (int i = 0; i < nifs.length; i++) {
            nifs[i] = DNI.newRandom();
            nifs[i].imprime();
        }
       for (int i = 0; i < nifs.length; i++) {
            if (nifs[i].getLetra() == 'A' ||nifs[i].getLetra() == 'E' ||nifs[i].getLetra() == 'I' ||nifs[i].getLetra() == 'O' ||nifs[i].getLetra() == 'U' ) {
                vocales++;
            }
       }
       System.out.println("Hay " + vocales + " nifs que acaban en vocal");

    }
}
