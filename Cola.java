
package Colas;

import javax.swing.JOptionPane;

/**
 *
 * @author ilike
 */
public class Cola {
    private Nodo Star, Final;
    String Cola ="";
    
    public Cola (){
            Star = null;
    Final = null;
    }
    
    //is_empty() -> ¿Está vacía?
    public boolean isEmpty(){
        if (Star == null) {
           return true; 
        }else{
           return false; 
        }
    }
    
    //enqueue( elem ) -> Ingresa un elemento al final.
    public void enqueue(int informacion){
        Nodo nuevo_nodo= new Nodo();
        nuevo_nodo.informacion= informacion;
        nuevo_nodo.siguiente=null;
        
        if (isEmpty()) {
            Star = nuevo_nodo;
            Final = nuevo_nodo;
            
        }else{
            Final.siguiente= nuevo_nodo;
            Final = nuevo_nodo;        
        }
  
    }
    
    //dequeue() -> Saca el elemento que se encuentra el frente de la estructura.
    public int dequeue (){
        if (!isEmpty()) {
            int dato = Star.informacion;
            
            if (Star==Final) {
                Star = null;
                Final = null;               
            } else {
                Star= Star.siguiente;
            }
            return dato;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //length() -> Número de elementos en la cola.
    public void lenght(){
        Nodo scan = Star;
        String ColaInvertida= "";
        
        while (scan !=null){
            Cola += scan.informacion + " ";
            scan = scan.siguiente;
            
            
        }    
        
        String cadena[] =Cola.split(" ");
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " "+cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola ="";
    }
    
}
