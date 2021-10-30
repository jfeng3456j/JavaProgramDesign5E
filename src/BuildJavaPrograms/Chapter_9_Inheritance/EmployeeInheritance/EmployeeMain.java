package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class EmployeeMain {

    public static void main (String[] args) {
        System.out.print("Employee: ");
        Employee lisa = new Employee();
        System.out.print(lisa.getHours() + ", ");
        System.out.printf("$%.2f, ", lisa.getSalary());
        System.out.print(lisa.getVacationDays()+", ");
        System.out.print(lisa.getVacationForm());
        System.out.println();
        System.out.print("Secretary: ");
        SecretaryChild luna = new SecretaryChild();
        System.out.print(luna.getHours()+", ");
        System.out.printf("$%.2f, ", luna.getSalary());
        System.out.print(luna.getVacationDays()+", ");
        System.out.print(luna.getVacationForm());
        luna.takeDictation(" Test Inheritance");

        System.out.print("Lawyer: ");
        LawyerChild Lex = new LawyerChild();
        System.out.print(Lex.getHours()+", ");
        System.out.printf("$%.2f, ", Lex.getSalary());
        System.out.print(Lex.getVacationDays()+", ");
        System.out.print(Lex.getVacationForm());
        Lex.sue();

        System.out.print("Legal Secretary: ");
        LegalSecretaryChild lily = new LegalSecretaryChild();
        System.out.print(lily.getHours()+", ");
        System.out.printf("$%.2f, ", lily.getSalary());
        System.out.print(lily.getVacationDays()+", ");
        System.out.print(lily.getVacationForm());
        luna.takeDictation("File briefs");



    }
}
