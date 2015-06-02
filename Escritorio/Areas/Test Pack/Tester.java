/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import superficies.Presentation;

/**
 *
 * @author ddizoya
 */
@RunWith(Parameterized.class)
public class Tester {

    long esperado;
    long input;
    Presentation obj;

    public Tester(long esperado, long input) {
        this.esperado = esperado;
        this.input = input;
    }

    @Before
    public void iniciar() {
        obj = new Presentation();
    }

    @Parameters
    public static Collection metodoSquare() {
        return Arrays.asList(new Object[][]{
            {10, 10},
            {15, 15},
            {20, 20}
        });
    }

    @Test
    public void empezarTest() {

        assertEquals(esperado, obj.square(input));
    }

}
