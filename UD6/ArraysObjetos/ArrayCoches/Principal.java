package ArrayCoches;

import java.util.Scanner;

public class Principal {
    public static Scanner lec = new Scanner(System.in);
    public static void main(String[] args) {
    Coche coches [] = new Coche[3];
    int riesgo = 0,tercero = 0,metal = 0,viejo = 0;
    for (int i = 0; i < coches.length; i++) {
        coches[i] = new Coche();
        System.out.println("Dame el modelo del coche");
        coches[i].setModelo(lec.next());
        System.out.println("Dame el color del coche");
        coches[i].setColor(lec.next());
        System.out.println("Dime si la pintura es metalizada (true or false)");
        coches[i].setEsMetalizado(lec.nextBoolean());
        System.out.println("Dime la matrícula del coche");
        coches[i].setMatricula(lec.next());
        System.out.println("Dime el tipo del coche 0-mini 1-utilitario 2-familiar 3-deportivo ");
        coches[i].setTipoC(lec.nextInt());
        System.out.println("Dime el año de fabricación");
        coches[i].setAñoFabricacion(lec.nextInt()); 
        System.out.println("Dime la modalidad del seguro 0-terceros 1-todoRiesgo");
        coches[i].setTipoS(lec.nextInt());
        lec.nextLine();
    }
    for (int i = 0; i < coches.length; i++) {
        riesgo = coches[i].contRiesgo();
        tercero = coches[i].contTerceros();
        viejo = coches[i].contViejos();
        metal = coches[i].sumaMetalizados();
        coches[i].imprimeCoche();
    }
    System.out.println("Hay " + metal + " coches metalizados");
    System.out.println("Hay " + viejo + " coches fabricados antes del 2000");
    System.out.println("Hay " + tercero + " coches con el seguro a terceros");
    System.out.println("Hay " + riesgo + " coches con el seguro a todo riesgo");
        
    }


    }
