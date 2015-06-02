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
public class TestParametrizadoString {

    public TestParametrizadoString() {
        int input1;
        int input2;
        String esperado;
        Calculo obj = new Calculo();
    }

    @Parameterized.Parameters
    public Collection metodoMCDstring() {
        return Arrays.asList(new Object[][]{
            {50, 20, "Cálculo correcto"},
            {60, 10, "Cálculo correcto"},
            {9000, 40, "Cálculo correcto"},
            {124, 5, "Cálculo correcto"}

        });
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
