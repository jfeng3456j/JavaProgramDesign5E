/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 * @author Feng-iMac
 */
public class ConvertLengthTest {
    //initialize the convert length object
    ConvertLength lc = new ConvertLength();
    
    public ConvertLengthTest() {
    }
    
    @Test
    public void testConvertFeetToInches() {
    int feet = 5;
    int expected  = 60;
    int actual = lc.convertToInches(feet,0);
    assertEquals(expected,actual);
    }
    
    @Test
    public void testConvertWithInches() {
    int feet = 10;
    int inches =20;
    int expected = 140;
    int actual = lc.convertToInches(feet, inches);
    assertEquals(expected, actual);
    }
    
    @Test
    public void testConvertInchesToCent() {
    int totalInches = 170;
    double expected = 431.8;
    double actual = lc.convertToCent(totalInches);
    assertEquals(expected, actual,0.01); //asertEquals can't compare double because of trailing decimals, must specific the number of decimals to compare
    }
    
    
}
