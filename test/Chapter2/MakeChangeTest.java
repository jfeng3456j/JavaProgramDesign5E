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
public class MakeChangeTest {
    MakeChange mc = new MakeChange();
    
    public MakeChangeTest() {
    }
    
    @Test
    public void convertToHalfDollar() {
    int totalCents = 646;
    int expectedHalfDollar = 12;
    int actual = mc.convertHalfDollar(totalCents);
    assertEquals(expectedHalfDollar, actual); 
    }
    
    @Test
    public void convertToQuarter() {
    int totalCents = 646;
    int expectedQuarter = 1;
    int actual = mc.convertToQuarter(totalCents);
    assertEquals(expectedQuarter,actual);
    }
    
    @Test
    public void convertToDime() {
    int totalCents = 646;
    int expectedDime = 2;
    int actual = mc.convertToDime(totalCents);
    assertEquals(expectedDime,actual);
    }
    
    @Test
    public void convertToNickel() {
    int totalCents = 646;
    int expectedNickel = 0;
    int actual = mc.convertToNickel(totalCents);
    assertEquals(expectedNickel,actual);
    }
    
    @Test
    public void convertToCents() {
    int totalCents = 646;
    int expectedCent = 1;
    int actual = mc.convertToCent(totalCents);
    assertEquals(expectedCent,actual);
    }
    
}
