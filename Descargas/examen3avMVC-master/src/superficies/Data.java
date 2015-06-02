/*
 * Esta clase contiene todos los datos necesarios para elaborar una figura geométrica.
 * En ella se guarda toda la información o data. 
 */
package superficies;

/**
 *
 * @author ddizoya
 */
public class Data {

    String shapeType;

    class Square {

        public Square(long sideLength) {
            this.sideLength = sideLength;
        }

        long sideLength;
        long squareArea;

    }

}
