package Day3;


class Employee {
static int count = 0;
String name;


 Employee(String name) {
     this.name = name;
     count++;
 }


 void display() {
     System.out.println("Employee Name: " + name);
 }


 static void displayEmployeeCount() {
     System.out.println("Total Employees: " + count);
 }
}


public class Sample6 {
 public static void main(String[] args) {
    
     Employee e1 = new Employee("John");
     Employee e2 = new Employee("Alice");
     Employee e3 = new Employee("Bob");

   
     e1.display();
     e2.display();
     e3.display();

    
     Employee.displayEmployeeCount();
 }
}

