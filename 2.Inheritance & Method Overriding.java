class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double calculateSalary() {
        return 37000;
    }
}

class PartTimeEmployee extends Employee {
    double calculateSalary() {
        return 8000;
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full Time Salary: " + e.calculateSalary());

        e = new PartTimeEmployee();
        System.out.println("Part Time Salary: " + e.calculateSalary());
    }
}
