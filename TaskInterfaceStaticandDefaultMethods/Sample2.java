package TaskInterfaceStaticandDefaultMethods;

interface RemoteControl1{
	abstract void turnOn();
	default void batteryStatus() {
		System.out.println("Battery Status");
	}	
	
	static  void  info() {
		System.out.println("info");
	}
	
	
}
class TV1 implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("turnOn");
		
	}
	
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV1 r1=new TV1();
		r1.turnOn();
		r1.batteryStatus();
		RemoteControl.info();

	}

}

//Task 1: Interface with Abstract + Default Method
// Create an interface RemoteControl with:
//o Abstract method turnOn()
//o Default method batteryStatus()
// Implement it in a class TV.
//Task 2: Static Method in Interface
// Add a static method info() to the RemoteControl interface.
// Call this method using the interface name.