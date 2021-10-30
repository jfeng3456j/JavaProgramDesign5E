package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class SecretaryChild extends Employee {

    public void takeDictation(String text) {
        System.out.println(" Dictating test: " + text);
    }
}
