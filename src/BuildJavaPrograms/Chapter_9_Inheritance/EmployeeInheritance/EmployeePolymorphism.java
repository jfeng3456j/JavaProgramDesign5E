package BuildJavaPrograms.Chapter_9_Inheritance.EmployeeInheritance;

public class EmployeePolymorphism {

    public static void main (String[] args) {
        Employee lana = new Employee();
        LawyerChild lulu = new LawyerChild();
        SecretaryChild lexi = new SecretaryChild();
        LegalSecretaryChild lina = new LegalSecretaryChild();
        printInfo(lana);
        printInfo(lulu);
        printInfo(lexi);
        printInfo(lina);

        Employee ed = new SecretaryChild();
        ((SecretaryChild) ed).takeDictation("ehllo");
    }

    public static void printInfo(Employee e) {
        System.out.print(e.getHours() + ", ");
        System.out.printf("$%.2f, ", e.getSalary());
        System.out.print(e.getVacationDays()+", ");
        System.out.print(e.getVacationForm()+", ");
        System.out.println(e);
    }

}
