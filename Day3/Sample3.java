package Day3;

class Student1{
    String name;
    int age;

    // Default Constructor
    Student1() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    Student1(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Sample3 {
    public static void main(String[] args) {
        // Using default constructor
        Student1 s1 = new Student1();
        s1.display();

        // Using parameterized constructor
        Student1 s2 = new Student1("Shivendra", 22);
        s2.display();
    }
}
