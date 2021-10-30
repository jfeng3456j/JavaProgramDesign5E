package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class LawyerChild extends Employee {

    public int getVacationDays() {
        return 15;
    }

    public double getSalary() {
        return super.getSalary() + 70000;
    }

    public String getVacationForm() {
        return "pink";
    }

    public void sue() {
        System.out.println("Court cases");
    }
}
