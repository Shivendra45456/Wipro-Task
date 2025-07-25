package TaskAbstractClassvsInterface;


abstract class Appliance{
	abstract void turnOn();
}

interface Connectable{
	void connect();
}

class SmartTV extends Appliance implements Connectable{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting");
		
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TurnOn");
		
	}
	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV s1=new SmartTV();
		s1.connect();
		s1.turnOn();

	}

}


//Task 8: Abstract vs Interface Comparison
// Create:
//o Abstract class Appliance with method turnOn()
//o Interface Connectable with method connect()
// Class SmartTV extends Appliance and implements Connectable
// Implement the methods and call them.