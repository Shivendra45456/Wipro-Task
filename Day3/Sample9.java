package Day3;


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
public class Sample9{
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


