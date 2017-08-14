
package bloque64;

public class Vertice {
    private int x,y;
    
    //Constructor
    public Vertice(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    //Set y Get
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x = x;
    }
    
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}
