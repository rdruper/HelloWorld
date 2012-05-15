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
 * 
 * 
 */
public class CalculatorTest {
    //testing commit 3
	
	Calculator calc;
	
	@Before
    public void setUp() {
		calc = new Calculator(1, 1);
    }
	
	
    @Test
    public void testAdd() {
    	assertEquals(2, calc.add(),0.01);
    }
    
    @Test
    public void testSubtract() {
    	assertEquals(0, calc.subtract(),0.01);
    }
    
    @Test
    public void testMultiply() {
    	assertEquals(1, calc.multiply(),0.01);
    }
    
    @Test
    public void testDivide() {
    	assertEquals(1, calc.divide(),0.01);
    }
    
    /*@Test
    public void testDivide3() {
        double x = Calculator.divide(10,0);
        assertEquals(x, 3.33, 0.01);
    }
    */
     
    @Test
    public void testFatorial() {
    	Calculator calc = new Calculator(1,1);
    	double x = calc.fatorial(6);
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
    
    
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
