package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class LegalSecretaryChild extends SecretaryChild{

    //override
    public double getSalary() {
        return super.getSalary() + 5000;
    }

    public void fileLegalBriefs() {
        System.out.println("file lawsuits");
    }
}
