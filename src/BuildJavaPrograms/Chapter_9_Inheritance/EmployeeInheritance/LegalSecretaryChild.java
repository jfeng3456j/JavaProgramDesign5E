package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class LegalSecretaryChild extends SecretaryChild {

    public double getSalary() {
        return 45000.0;
    }

    public void fileLegalBriefs() {
        System.out.println("file paperwork");
    }
}
