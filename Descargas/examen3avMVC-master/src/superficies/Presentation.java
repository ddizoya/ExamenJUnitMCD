/*
 * Clase que interactúa con el usuario mediante inputs/outputs, como visualizaciones
 * y pedida de datos. 
 */
package superficies;

import java.util.Scanner;

/**
 *
 * @author ddizoya
 */
public class Presentation {

    Scanner sc = new Scanner(System.in);

    /**
     *
     * @param obj Se le manda un objeto de tipo Data. Mediante el atributo ShapeType,
     * y pidiendo por teclado al usuario, se seleccionará la forma deseada que se va a trabajar.
     * Este atributo nos servirá para evaluar la secuencia del programa en la clase lógica. 
     * @return Devuelve el propio objeto Data, que será trabajado posteriormente en la clase Lógica.
     */
    public Data selectShapeType(Data obj) {

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        obj.shapeType= sc.nextLine();
        System.out.println("You said: " + obj.shapeType);
        return obj;
    }

    /**
     *
     * @param obj Se le manda el objeto de tipo Data. Mediante este método se
     * calcula el área del cuadrado y su impresión por pantalla.
     */
    public long square(long a) {

        return a;
        
              
    }

}
