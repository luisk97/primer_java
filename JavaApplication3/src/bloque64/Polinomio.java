
package bloque64;
import java.util.Random;
public class Polinomio {
    private Vertice[] v;
    
    public Polinomio(int tam){
        int aux1,aux2;
        Random rand = new Random(System.nanoTime());
        v = new Vertice[tam];
        
        for(int i = 0;i< tam;i++){
            aux1= rand.nextInt(10);
            aux2 = rand.nextInt(10);
            
            v[i]= new Vertice(aux1,aux2);
        }
    }
    // Eh aqui los cambios de esta clase doblemente peerra lml
    public void muestra(int i){
        
        System.out.println("El valor de la posicion: "+i+" es x: "+v[i].getx()+" e y es: "+v[i].gety());
        
    }
    
}
