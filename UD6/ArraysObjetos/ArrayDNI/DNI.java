package ArrayDNI;

public class DNI {
    private int dni;
    
    public DNI(int numero) {
        this.dni = numero;
    }  
    public DNI() {
        
    } 

    public int getDNI(){
        return dni;
    }

    public char getLetra(){
        char letra;
        int n = this.dni % 23;
        switch (n) {
            case 0:
                letra = 'T';
                break;
            
            case 1:
                letra = 'R';
                break;
            
            case 2:
                letra = 'W';
                break;
            
            case 3:
                letra = 'A';
                break;
            
            case 4:
                letra = 'G';
                break;
            
            case 5:
                letra = 'M';
                break;
            
            case 6:
                letra = 'Y';
                break;
            
            case 7:
                letra = 'F';
                break;
            
            case 8:
                letra = 'P';
                break;
            
            case 9:
                letra = 'D';
                break;
            
            case 10:
                letra = 'X';
                break;
            
            case 11:
                letra = 'B';
                break;
            
            case 12:
                letra = 'N';
                break;
            
            case 13:
                letra = 'J';
                break;
            
            case 14:
                letra = 'Z';
                break;
            
            case 15:
                letra = 'S';
                break;
            
            case 16:
                letra = 'Q';
                break;
            
            case 17:
                letra = 'V';
                break;
            
            case 18:
                letra = 'H';
                break;
            
            case 19:
                letra = 'L';
                break;
            
            case 20:
                letra = 'C';
                break;
            
            case 21:
                letra = 'K';
                break;
            
            case 22:
                letra = 'E';
                break;
            
            default:
                letra = '@';
                break;
        }
        return letra;
    }
    public String getNIF(){
       return(String.valueOf(dni)+getLetra());
    }
    public void imprime(){
        System.out.println(getNIF());
    }

    public static DNI newRandom() {
        // Generar un número aleatorio de 8 dígitos y calcular el dígito de control
        int num = (int) (Math.random() * 90000000) + 10000000;
       
        // Crear un nuevo objeto DNI con el número generado
        DNI dni = new DNI(num);
    
        // Devolver el objeto DNI generado
        return dni;
    }
}
