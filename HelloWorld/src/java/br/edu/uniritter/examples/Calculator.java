/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniritter.examples;

/**
 *
 * @author alu201230433
 */
public class Calculator {
	
	double _a;
	double _b;
	
    
    public Calculator(double a, double b) {
		_a = a;
		_b = b;
		
	}

	public double add() {        
		return _a + _b;
    }
    
    public double subtract() {
        return _a - _b;
    }
    
    public double multiply() {
        return _a * _b;
    }
    
    public double divide() {
        return _a / _b;
    }
    
    public double fatorial(double a) {
        /*int res = 1;
        for (int i=a; i>1; i--) {
            res = res*i;
        }
        return res;
         * 
         */
        if (a < 1) {
            return 1;
        }
        return a * fatorial(a-1);
    }
    
}
