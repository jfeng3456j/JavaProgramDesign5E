/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;
import JavaProgramDesign.Chapter3.JavaIOStudentGrade;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import java.util.Scanner;

/**
 *
 * @author Feng-iMac
 */
public class StudentGradeTest {
    
    JavaIOStudentGrade js = new JavaIOStudentGrade();
    
    public StudentGradeTest() {
    }
    
    
    @Test
    public void testCalGrade() {
    double expected = 70.0;
    double actual = js.calcGrade(new Scanner("70.0 70.0 70.0 70.0 70.0"));
    assertEquals(expected, actual,0.02);
    }
    
    
}


//@Test
//https://stackoverflow.com/questions/31635698/junit-testing-for-user-input-using-scanner
//public void shouldTakeUserInput() {
//    InputOutput inputOutput= new InputOutput();
//
//    String input = "add 5";
//    InputStream in = new ByteArrayInputStream(input.getBytes());
//    System.setIn(in);
//
//    assertEquals("add 5", inputOutput.getInput());
//}
