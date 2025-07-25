package TaskClassesObjectsVariables;
class Employee{
	public static int count=0;
	public Employee(){
		count+=1;
		
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println(Employee.count);

	}

}

//Task 2: Employee Count
// Create a class Employee with a static variable count to track number of employees
//created.
// Each time a new Employee is instantiated, increase the count.
// Print the total number of employees at the end.
