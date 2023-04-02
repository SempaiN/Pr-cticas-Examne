package ArrayReloj;

public class Principal {
    public static Reloj items[] = new Reloj[5];
    public static void main(String[] args) {
        items[0] = new Reloj(15, 16, 18); 
        items[1] = new Reloj(21, 21, 21);
        items[2] = new Reloj(10, 59, 59);
        items[3]= new Reloj(23, 0, 59);
        items[4] = new Reloj(0, 0, 1);
        System.out.println("1.-");
        verRelojes();
        System.out.println();
        System.out.println("2.-");
        for (int i = 0; i < items.length; i++) { //Sumo 1s a cada reloj
            items[i].tick();
        }
        verRelojes();
        System.out.println();
        System.out.println("3.-");
        for (int i = 0; i <5; i++) {//Sumo un minuto
            for (int j = 0; j <= 60; j++) {
                items[i].tick();
            }
        }
        verRelojes();
        System.out.println();
        System.out.println("4.-");
        for (int i = 0; i <5; i++) { //Buscle para sumar en cada reloj
            for (int j = 0; j <60*60; j++) { // Bucle que si se llegan a 60 minutos acaba
                if(items[i].getMinutos() == 60 ){
                    break;
                }
                else{ //Mientras no llegue a 60m suma segundos 
                    items[i].tick(); 
                }
                

            }
        }
        verRelojes();
        
    }

    //Método para mostrar todos los relojes
    public static void verRelojes(){
        for (int i = 0; i < items.length; i++) {
            items[i].imprimeHora();
            items[i].imprimeHora12();
            System.out.println();
        }
    }
}