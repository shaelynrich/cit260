/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shaelyn
 */
public class ComplexEquationsControlTest {
    
    public ComplexEquationsControlTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcRandomEquation method, of class ComplexEquationsControl.
     */
    @Test
    public void testCalcRandomEquation() {
        System.out.println("Test Case 1a");
        double x = 8;
        double y = 12;
        double z = 2;
        double userAnswer = 32;
        ComplexEquationsControl instance = new ComplexEquationsControl();
        boolean expResult = true;
        boolean result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 1b");
        x = 8;
        y = 12;
        z = 2;
        userAnswer = 33;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 2");
        x = -1;
        y = 7;
        z = 1;
        userAnswer = 5;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 3");
        x = 16;
        y = 5;
        z = 1;
        userAnswer = 6;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 4");
        x = 5;
        y = -1;
        z = 8;
        userAnswer = 33;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 5");
        x = 15;
        y = 16;
        z = 15;
        userAnswer = 240;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 6");
        x = 1;
        y = 10;
        z = -1;
        userAnswer = 5;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 7");
        x = 1;
        y = 12;
        z = 18;
        userAnswer = 32;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 8");
        x = 8;
        y = 12;
        z = 2;
        userAnswer = 0;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 9");
        x = 0;
        y = 7;
        z = 1;
        userAnswer = 5;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 10");
        x = 15;
        y = 5;
        z = 1;
        userAnswer = 6;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 11");
        x = 5;
        y = 0;
        z = 8;
        userAnswer = 33;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 12");
        x = 15;
        y = 15;
        z = 15;
        userAnswer = 240;
        expResult = true;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 13");
        x = 1;
        y = 10;
        z = 0;
        userAnswer = 5;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 14");
        x = 5;
        y = 4;
        z = 15;
        userAnswer = 15;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 15");
        x = 5;
        y = 4;
        z = 3;
        userAnswer = 0;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        System.out.println("Test Case 16");
        x = 5;
        y = 4;
        z = 3;
        userAnswer = 240;
        expResult = false;
        result = instance.calcRandomEquation(x, y, z, userAnswer);
        assertEquals(expResult, result);
        }
}
