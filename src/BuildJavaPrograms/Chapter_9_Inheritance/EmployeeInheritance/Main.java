package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class Main {

    public static void main(String[] args) {
        System.out.println("Employee");

        Employee ee = new Employee();
        System.out.println(ee.getHours() + ",");
        System.out.printf("$%.2f, ", ee.getSalary());
        System.out.println(ee.getVacationDays() + ",");
        System.out.println(ee.getVacationForm());


        System.out.println("Secretary");
        SecretaryChild secretaryChild = new SecretaryChild();
        System.out.println(secretaryChild.getHours() + ",");
        System.out.printf("$%.2f, ", secretaryChild.getSalary());
        System.out.println(secretaryChild.getVacationDays() + ",");
        System.out.println(secretaryChild.getVacationForm());
        secretaryChild.takeDictionary("hello");

        System.out.println("Lawyer: ");
        LawyerChild lawyerChild = new LawyerChild();
        System.out.println(lawyerChild.getHours() + ",");
        System.out.printf("$%.2f, ", lawyerChild.getSalary());
        System.out.println(lawyerChild.getVacationDays() + ",");
        System.out.println(lawyerChild.getVacationForm());
        lawyerChild.sue();

        System.out.println("Legal Secretary: ");
        LegalSecretaryChild legalSecretaryChild = new LegalSecretaryChild();
        System.out.println(legalSecretaryChild.getHours() + ",");
        System.out.printf("$%.2f, ", legalSecretaryChild.getSalary());
        System.out.println(legalSecretaryChild.getVacationDays() + ",");
        System.out.println(legalSecretaryChild.getVacationForm());
        legalSecretaryChild.fileLegalBriefs();


    }
}
