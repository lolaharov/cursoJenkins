package es.curso;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
     @Test
    public static pruebaDoblar()
    {
        int resultado=App.doblar(5);
        assertEquals( resultado, 10) ;
    }
    
      @Test
    public static pruebaDoblarCero()
    {
        int resultado=App.doblar(0);
        assertEquals( resultado, 0) ;
    }
    
       @Test
    public static pruebaDoblarNegativo()
    {
        int resultado=App.doblar(-5);
        assertEquals( resultado, -10) ;
    }
}
