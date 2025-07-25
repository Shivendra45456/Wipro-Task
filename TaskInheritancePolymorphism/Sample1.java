package TaskInheritancePolymorphism;


class Vehicle {
	 String brand;
	 int speed;

	 void showDetails() {
	     System.out.println("Brand: " + brand);
	     System.out.println("Speed: " + speed);
	 }
	}


	class Car extends Vehicle {
	 void showDetails() {
	     System.out.println("Car Details:");
	     System.out.println("Brand: " + brand);
	     System.out.println("Speed: " + speed);
	 }
	}


	class Bike extends Vehicle {
	 void showDetails() {
	     System.out.println("Bike Details:");
	     System.out.println("Brand: " + brand);
	     System.out.println("Speed: " + speed);
	 }
	}

	//Main class
	public class Sample1{
	 public static void main(String[] args) {
	     Car car = new Car();
	     car.brand = "Honda";
	     car.speed = 150;

	     Bike bike = new Bike();
	     bike.brand = "Hero";
	     bike.speed = 80;

	     car.showDetails();
	     System.out.println();
	     bike.showDetails();
	 }
	}


//Task 5: Inheritance - Vehicle System
// Base class: Vehicle (fields: brand, speed)
// Derived class: Car, Bike
// Override a method showDetails() in each derived class.