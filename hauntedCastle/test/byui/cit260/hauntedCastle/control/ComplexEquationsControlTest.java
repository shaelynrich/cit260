/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

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

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
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

    /**
     * Test of calcVolumeOfPotion method, of class ComplexEquationsControl.
     */
    @Test
    public void testCalcVolumeOfPotion() {
        System.out.println("test 1");
        double radius = 2;
        double height = 4;
        double volumeOfCylinder = 50.27;
        double correctVolumeOfCylinder = 50.27;
        ComplexEquationsControl instance = new ComplexEquationsControl();
        double expResult = 50.27;
        double result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
        System.out.println("test 2");
        radius = 8;
        height = -2;
        volumeOfCylinder = -1;
        correctVolumeOfCylinder = -1;
        expResult = -1;
        result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
        System.out.println("test 3");
        radius = 23;
        height = 9;
        volumeOfCylinder = -1;
        correctVolumeOfCylinder = -1;
        expResult = -1;
        result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
        System.out.println("test 4");
        radius = 23;
        height = 0;
        volumeOfCylinder = -1;
        correctVolumeOfCylinder = -1;
        expResult = -1;
        result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
        System.out.println("test 5");
        radius = 2;
        height = 10.5;
        volumeOfCylinder = -1;
        correctVolumeOfCylinder = -1;
        expResult = -1;
        result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
        System.out.println("test 5");
        radius = -7;
        height = 9;
        volumeOfCylinder = -1;
        correctVolumeOfCylinder = -1;
        expResult = -1;
        result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
        System.out.println("test 6");
        radius = 0;
        height = 12;
        volumeOfCylinder = -1;
        correctVolumeOfCylinder = -1;
        expResult = -1;
        result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
        System.out.println("test 7");
        radius = 13.5;
        height = 9;
        volumeOfCylinder = -1;
        correctVolumeOfCylinder = -1;
        expResult = -1;
        result = instance.calcVolumeOfPotion(radius, height, volumeOfCylinder, correctVolumeOfCylinder);
        assertEquals(expResult, result,0.0);
    }
}
