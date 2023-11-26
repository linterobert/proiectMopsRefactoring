package RefactoredFiles.SelfEncapsulateField;

public class Person {
    public String name;
    private double salary;

    public Person(String name, double salary) {
        this.name = name;
        setSalary(salary); // Use the setter method to initialize the salary
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Additional logic or validation can be added here
        this.salary = salary;
    }
}
