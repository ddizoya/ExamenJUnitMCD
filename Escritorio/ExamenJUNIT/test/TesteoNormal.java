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

    @Before
    public void inicializar() {
        obj = new Calculo();
    }

    @Test
    public void testeo() {
        int input1 = 50;
        int input2 = 20;
        int valorEsperado = 10;

        assertEquals(valorEsperado, obj.obtenerMCD(input1, input2));
    }

}
