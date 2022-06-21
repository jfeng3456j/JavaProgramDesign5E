package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class SecretaryChild extends Employee{
    //SecretaryChild will inherit copies of the getHours, getSalary, getVacationDays, and
    //getVacationForm methods,



    public void takeDictionary(String text) {
        System.out.println("Dictating text: " + text);
    }


}
