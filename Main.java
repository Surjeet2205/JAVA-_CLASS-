import java.util.Scanner;

class Student {

    // 1. Variables
    String name;
    int age;
    int rollNo;
    int marks;

    // 2. input() method
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    // 3. display() method
    void display() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // 4. Create Student object
        Student s = new Student();

        // 5. Call input()
        s.input();

        // 6. Call display()
        s.display();
    }
}