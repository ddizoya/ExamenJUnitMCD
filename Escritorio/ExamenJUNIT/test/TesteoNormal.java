/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mcd.Calculo;
import mcd.MCD;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ddizoya
 */
public class TesteoNormal {

    Calculo obj;

    //Antes de nada, referenciamos el objeto. 
    @Before
    public void inicializar() {
        obj = new Calculo();
    }

    @Test
    public void testeo() {
        //Los input son los valores que vamos a meter dentro del método obtenerMCD.
        int input1 = 50;
        int input2 = 20;
        
        //Este es el valor que estamos esperando que retorne.
        int valorEsperado = 10;
        
        //Con este método vemos si el valor esperado (en nuestro caso 10, para los valores 50 y 20),
        //es el que devuelve el método de la clase Calculo, y coinciden.  
        assertEquals(valorEsperado, obj.obtenerMCD(input1, input2));
    }

}
