package Banco;

/**
 * Usuario
 */
public class Usuario {
    private String nombre;
    private double saldo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario(String nombre, double edad){
        if (edad <= -100) {
            System.out.println("Esta cuenta no se puede crear");
        }
        else{
            this.nombre = nombre;
            this.saldo = edad;
        }
        
    }
    
    public void ingresarDinero(double dinero){
        if (dinero > 0) {
            this.saldo += dinero;
        }
        else{
            System.out.println("Cantidad incorrecta introducida");
        }
    }

    public void retirarDinero(double dinero){
        double dineroAct = this.saldo;
        if ((dineroAct -dinero) <= -100) {
            System.out.println("Esa cantidad no se puede retirar");
        }
        else{
            this.saldo -= dinero;
        }
    }

    public static boolean transferirDinero(double origen , double destino, double mover){
        boolean sepuede = false;
        if ((origen - mover) <= -100) {
            System.out.println("No se puede efectuar la transferencia");
        }
        else{
            sepuede = true;
        }
        return sepuede;
    }
    
    public static void eliminarCuenta(){
        Principal.verCuentas();
        System.out.println("Elige una cuenta");
        int cuenta = Principal.dameInt();
        if (cuenta >= Principal.usuarios.size()) {
            System.out.println("Esa cuenta no existe");
        }
        else{
            Principal.usuarios.remove(cuenta);
        }
    }

    public static void buscarCuenta(){
        Principal.lector.nextLine();
        System.out.println("Dame el texto y te busco un usr");
        String busqueda = Principal.dameString().toLowerCase();
        for (int i = 0; i < Principal.usuarios.size(); i++) {
            if (Principal.usuarios.get(i).getNombre().toLowerCase().contains(busqueda)) {
                System.out.println(Principal.usuarios.get(i).getNombre() + " Saldo: " + Principal.usuarios.get(i).getSaldo());
            }
        }
    }

    public static void buscarMorosos(){
        int cont = 0;
        for (int i = 0; i <Principal.usuarios.size(); i++) {
            if (Principal.usuarios.get(i).getSaldo() < 0) {
                System.out.println(Principal.usuarios.get(i).getNombre() + " Saldo: " + Principal.usuarios.get(i).getSaldo());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No hay morosos");
        }
    }
    
}