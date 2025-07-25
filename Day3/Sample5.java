package Day3;

//Book.java
class Book {

 String title;
 String author;
 double price;


 Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }


 void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: " + price);
     System.out.println("--------------- ");
 }
}


public class Sample5 {
 public static void main(String[] args) {
    
     Book book1 = new Book("Wings of Fire", "Dr. A.P.J. Abdul Kalam", 299.50);
     Book book2 = new Book("The Alchemist", "Paulo Coelho", 350.00);

     
     System.out.println("Book 1 Details:");
     book1.displayDetails();

     System.out.println("Book 2 Details:");
     book2.displayDetails();
 }
}

