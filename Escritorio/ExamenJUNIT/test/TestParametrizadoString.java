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

    int input1;
    int input2;
    String esperado;
    Calculo obj = new Calculo();
    
    //Constructor para evaluar el test parametrizado. 
    public TestParametrizadoString(int input1, int input2, String esperado) {
        this.input1 = input1;
        this.input2 = input2;
        this.esperado = esperado;
    }

    //Hemos modificado el método de la claseMCD para que retorne un String, y testeamos
    //el código para ver si, al meter valores válidos, nos retorna que se ha ejecutado correctamente.
    @Parameterized.Parameters
    public static Collection metodoMCDstring() {
        return Arrays.asList(new Object[][]{
            {50, 20, "Cálculo correcto"},
            {60, 10, "Cálculo correcto"},
            {9000, 40, "Cálculo correcto"},
            {124, 5, "Cálculo correcto"}

        });
    }
    
    //Testeo. Empleamos assert equals para ver si coincide con lo evaluado en el 
    //método parametro metodoMCDstring()
    @Test
    public void testeo() {
        assertEquals(esperado, obj.obtenerMCD(input1, input2));
    }
}
