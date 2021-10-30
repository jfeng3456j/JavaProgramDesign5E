/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;


/**
 *
 * @author Feng-iMac
 */
public class JavaOutFileIOTest {
    
    public JavaOutFileIOTest () {
    }
    
    JavaOutFileIO jo = new JavaOutFileIO();
    
    @Test
    public void testCalSum() {
    int expected = 200;
    int actual = jo.calcSum(new Scanner("100 100"));
    assertEquals(expected, actual);
    }
    
    @Test
    public void testSaveSum() {
    String expected = "data is Saved";
    int num1 = 100;
    int num2 = 101;
    String actual = jo.saveSum(num1, num2);
    assertEquals(expected, actual);
    
    }
    
}
