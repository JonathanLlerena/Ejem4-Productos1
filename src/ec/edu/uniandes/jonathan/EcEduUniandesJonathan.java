/*
Uniandes - Puyo 
Productos
Octavo Semestre
Jonathan Llerena
25-05-2016
*/

package ec.edu.uniandes.jonathan;
import java.util.ArrayList;
/**
 *
 * @author Jonathan Llerena
 */
public class EcEduUniandesJonathan {

    public static void main(String[] args) {
        ArrayList<clsProductos> prod = new ArrayList<clsProductos>();
        
        clsProductos prod1 = new clsProductos (1, "clavo", 10, clsProductos.unidad.libras);
        clsProductos prod2 = new clsProductos (2, "aceite", 20, clsProductos.unidad.litro);
        clsProductos prod3 = new clsProductos (1, "zinc", 30, clsProductos.unidad.metro);
        clsProductos prod4 = new clsProductos (1, "3 en 1", 40, clsProductos.unidad.libras);
        clsProductos prod5 = new clsProductos (5, "lija", 50, clsProductos.unidad.libras);
        
        prod.add(prod1);
        prod.add(prod2);
        prod.add(prod3);
        prod.add(prod4);
        prod.add(prod5);
        imprimir(prod);
    }
    
    public static void imprimir(ArrayList<clsProductos> prod){
        
        for (clsProductos producto : prod){
            System.out.println("**********************");
            System.out.println("Id: " + producto.Id());
            System.out.println("Nombre: " + producto.Nombre());
            System.out.println("Valor: " + producto.Valor());
            System.out.println("Unidad: " + producto.Unidad());
            System.out.println("");            
        }
    }
}