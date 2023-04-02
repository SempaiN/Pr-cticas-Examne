package D1;

public class Punto {
    private int x,y;

    public void setXY(int X , int Y){
        this.x = X;
        this.y = Y;
    }
    public void imprime(){
        System.out.println("("+x+","+y+")");
    }
}
