package OOPs.Problems;

public class Problem_11 {
    public static void main(String[] args) {
        // Creating Manager object
        Manager m1 = new Manager("Raman", 30, "EMP123", "IT", "DoCTracker");

        // Printing details
        m1.displayManager();
    }
}

//multi-inheritance
// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (inherits Person)
class Employees extends Person {
    String employeeId;
    String department;

    Employees(String name, int age, String employeeId, String department) {
        super(name, age); // Call Person constructor
        this.employeeId = employeeId;
        this.department = department;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

// Derived class (inherits Employee)
class Manager extends Employees {
    String projectName;

    Manager(String name, int age, String employeeId, String department, String projectName) {
        super(name, age, employeeId, department); // Call Employee constructor
        this.projectName = projectName;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Project Name: " + projectName);
    }


}
