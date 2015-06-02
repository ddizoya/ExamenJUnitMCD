/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import mcd.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ddizoya
 */
@RunWith(Parameterized.class)
public class TestParametrizado {

    int input1;
    int input2;
    int esperado;
    Calculo obj;

    public TestParametrizado(int input1, int input2, int esperado) {
        this.input1 = input1;
        this.input2 = input2;
        this.esperado = esperado;
    }

    @Before
    public void setUp() {
        obj = new Calculo();
    }

    @Parameterized.Parameters
    public static Collection testeoMetodoMCD() {
        return Arrays.asList(new Object[][]{
            {50, 20, 10},
            {60, 10, 10},
            {9000, 40, 40},
            {124, 5, 1}

        });
    }

    
    @Test
    public void testeo(){
        assertEquals(esperado, obj.obtenerMCD(input1, input2));
        System.out.println("Valor esperado:" + esperado +"Valor devuelto:" + obj.obtenerMCD(input1, input2));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
