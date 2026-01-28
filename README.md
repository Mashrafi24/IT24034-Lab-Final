  #1: Encapsulation & Validation

    
    class Student {
    private int id;
    private String name;
    private double cgpa;

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0");
        }
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(24034);
        s.setName("Mashrafi Rahman");
        s.setCgpa(3.77);

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());
    }
}


  #2: Inheritance & Method Overriding
   
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

#3.Abstract Class vs Interface

    abstract class Shape {
    abstract double area();
}

    interface Drawable {
    void draw();
}

    class Circle extends Shape implements Drawable {
    double radius = 5;

    double area() {
        return 3.14 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

    class Rectangle extends Shape implements Drawable {
    double length = 4, width = 6;

    double area() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

    public class MainShape {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}

#4.Exception Handling
  
    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter integers only");

        } finally {
            System.out.println("Program Execution Completed");
            sc.close();
        }
    }
}

#5.Object Interaction & Array of Objects

    class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(bookId + " " + title + " " + price);
    }
}

    public class BookMain {
    public static void main(String[] args) {

        Book[] books = new Book[5];

        books[0] = new Book(1, "Java", 1300);
        books[1] = new Book(2, "Python", 450);
        books[2] = new Book(3, "C++", 1050);
        books[3] = new Book(4, "DSA", 1370);
        books[4] = new Book(5, "OS", 500);

        double sum = 0;

        System.out.println("Books price > 1000:");
        for (Book b : books) {
            if (b.price > 1000) {
                b.display();
            }
            sum += b.price;
        }

        System.out.println("Average Price: " + (sum / books.length));
    }
}

