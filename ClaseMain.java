
package Colas;

import javax.swing.JOptionPane;

/**
 *
 * @author ilike
 */
public class ClaseMain {
    public static void main(String[]args){
    int option = 0, nodo_informacion = 0;
    Cola cola = new Cola();
    
     do {
            try {

                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La Cola esta vacia?\n"
                        + "4. Mostrar contenido de la Cola\n"        
                        + "5. Salir. \n\n"));
                
                switch (option) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Porfavor ingresa el valor a guardar en el nodo"));
                        cola.enqueue(nodo_informacion);
                        break;
                        
                    case 2:
                        if(!cola.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Se saco un nodo con el valor: "
                             + cola.dequeue());
                        }else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia.");
                        }
                        break;
                        
                    case 3:
                        if(cola.isEmpty()){
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola NO esta vacia");
                        }
                        break;
                        
                    case 4:
                        cola.lenght();
                        break;
                        
                    case 5:
                        option = 5;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                        break;
                }
                

            } catch (NumberFormatException e) {

            }
        } while (option != 5);
    }
}
