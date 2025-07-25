package TaskClassesObjectsVariables;


class Book{
	String title;
	String author ;
	double price;
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayDetails(){
		
		System.out.println(title+" "+author+" "+price);
		
	}
	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book obj1=new Book("Think like a monk","jay shetty",219);
		obj1.displayDetails();
		

	}

}


//Task 1: Create a Book Class
// Fields: title, author, price
// Method: displayDetails()
// In main(), create 2 book objects and print their details