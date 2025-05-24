/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

import JavaProgramDesign.Chapter2.DailyFarm;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author Feng-iMac
 */
public class TestDailyFarm {
    DailyFarm df = new DailyFarm();
    
    public TestDailyFarm() {
    
    }
    
    @Test
    public void testTotalMilkCarton() {
    double literMilkProduced = 70.90;
    int expected = 19;
    int actual = df.totalMilkCarton(literMilkProduced);
    assertEquals(expected, actual);
    }
    
    @Test
    public void testCalcCost() {
    double literMilkProduced = 70.90;    
    double expected = 26.94; //70.90 *0.38
    double actual = df.calcCost(literMilkProduced,0.38);
    assertEquals(expected, actual,0.02);
    }
    
    @Test
    public void testcalcProfit() {
    int cartons = 20;
    double expected = 5.4;
    double actual = df.calcProfit(cartons, 0.27);
    assertEquals(expected, actual,0.02);
    }
    
}
