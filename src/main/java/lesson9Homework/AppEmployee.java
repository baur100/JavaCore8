package lesson9Homework;

public class AppEmployee {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();
        firstEmployee.setFirstName("John");
        firstEmployee.setLastName("Smith");
        firstEmployee.setSalary(30000);
        String[] benefits = {"health insurance", "bonus", "vacation days"};
        firstEmployee.setBenefits(benefits);
        firstEmployee.printClass();

        String [] annasBenefits = {"health insurance", "bonus", "vacation days", "maternity leave"};
        Employee secondEmployee = new Employee("Anna", "Brown", 60000, annasBenefits);
        secondEmployee.printClass();

    }

}
