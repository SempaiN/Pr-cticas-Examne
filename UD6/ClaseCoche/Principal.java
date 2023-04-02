package ClaseCoche;

import ClaseCoche.Coche.modalidadSeguro;
import ClaseCoche.Coche.tipoCoche;

public class Principal {
    public static void main(String[] args) {
        Coche c1 = new Coche("Audi R8", "negro", "no metalizado", tipoCoche.deportivo, 2018,modalidadSeguro.terceros );
        Coche c2 = new Coche("Audi A2", "rojo", "metalizado", tipoCoche.utilitario, 2008,modalidadSeguro.todoRiesgo );
        Coche c3 = new Coche("Audi R8", "negro", "no metalizado", tipoCoche.familiar, 2018,modalidadSeguro.terceros );
       
        System.out.println(c1.getModelo() + " " + c1.getColor() + " " + c1.getTipoPintura() + " " + c1.getTipoCoche() + " " + c1.getAñoFabric() + " " + c1.getModalidadSeguro());
        System.out.println(c2.getModelo() + " " + c2.getColor() + " " + c2.getTipoPintura() + " " + c2.getTipoCoche() + " " + c2.getAñoFabric() + " " + c2.getModalidadSeguro());
    }
}
