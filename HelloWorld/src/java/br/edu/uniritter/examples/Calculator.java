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
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        return a / b;
    }
    
    public static double fatorial(double a) {
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
