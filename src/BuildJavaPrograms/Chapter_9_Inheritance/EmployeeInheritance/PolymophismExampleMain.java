package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class PolymophismExampleMain {

    public static void main(String[] args) {

        Employee law = new LawyerChild();
        Employee secretary = new SecretaryChild();
        Employee legal = new LegalSecretaryChild();



        printInfo(law);
        printInfo(secretary);
        printInfo(legal);

    }

    private static void printInfo(Employee e) {
        System.out.print(e.getHours() + ", ");
        System.out.printf("$%.1f", e.getSalary());
        System.out.print(e.getVacationDays() + ", ");
        System.out.print(e.getVacationForm());
        System.out.println();
    }
}
