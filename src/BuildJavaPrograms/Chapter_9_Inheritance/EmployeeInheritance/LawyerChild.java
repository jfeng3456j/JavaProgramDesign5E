package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class LawyerChild extends Employee{

    //overriding
    public int getVacationDays() {
        return 15;
    }

    public String getVacationForm() {
        return "pink";
    }

    public void sue() {
        System.out.println("Ability to bring people to court");
    }
}
