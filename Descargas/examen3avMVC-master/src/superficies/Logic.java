/**
 * Clase lógica del programa. Evalúa simplemente su ejecución. Es el núcleo
 * central del funcionamiento del programa, desde donde se ejecuta.
 */
package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author ddizoya
 */
public class Logic {

    
    
    

    public static void main(String[] args) {
        Presentation pt = new Presentation();
        Data dt = new Data();


        /*Sobreescribimos el objeto Data, porque el método del objeto
         Presentation recibe el objeto Data y lo retorna de nuevo.
         Ahora se podrá evaluar el ShapeType que el usuario ha escogido. 
         */
        dt = pt.selectShapeType(dt);
        if (dt.shapeType.equalsIgnoreCase("square")) {
            System.out.println("what is the side length?");
            long lenght = pt.square(15);
            System.out.println("the side is predefined: " + lenght);
            Data.Square obj = new Data().new Square(lenght);
            obj.squareArea = obj.sideLength * obj.sideLength;
            System.out.println(obj.squareArea);
         
        }

    }

}
