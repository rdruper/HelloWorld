/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.uniritter.examples.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alu201230433
 */
public class CalculatorTest {
    //testando commit
    @Test
    public void testAdd() {
        double x = Calculator.add(1,1);
        assertEquals(x, 2,0.01);
    }
    
    @Test
    public void testSubtract() {
        double x = Calculator.subtract(2,1);
        assertEquals(x, 1, 0.01);
    }
    
    @Test
    public void testMultiply() {
        double x = Calculator.multiply(5,7);
        assertEquals(x, 35, 0.01);
    }
    
    @Test
    public void testDivide() {
        double x = Calculator.divide(10,3);
        assertEquals(x, 3.33, 0.01);
    }
    
    /*@Test
    public void testDivide3() {
        double x = Calculator.divide(10,0);
        assertEquals(x, 3.33, 0.01);
    }
    */
     
    @Test
    public void testFatorial() {
        double x = Calculator.fatorial(6);
        assertEquals(x, 720, 0.01);
    }
    
    public CalculatorTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
