package TaskInheritancePolymorphism;


class Animal{
	public void sound() {
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal{
public void sound() {
		System.out.println("Dog make soung");
	}
}
class Cat extends Animal{
public void sound() {
		System.out.println("Cat make sound");
	}
}
class Cow extends Animal{
public void sound() {
		System.out.println("cow make sound");
	}
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		a.sound();
		Animal b=new Cat();
		b.sound();
		Animal c=new Cow();
		c.sound();
		

	}

}



//✅Task 7: Method Overriding
// Base class: Animal with sound() method
// Subclasses: Dog, Cat, Cow override the sound() method
// Use dynamic method dispatch (polymorphism) in main().
