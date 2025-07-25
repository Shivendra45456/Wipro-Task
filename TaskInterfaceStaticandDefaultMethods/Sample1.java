package TaskInterfaceStaticandDefaultMethods;

interface RemoteControl{
	abstract void turnOn();
	default void batteryStatus() {
		System.out.println("Battery Status");
	}
	static void info() {
		System.out.println("info");
		
	}	
}
class TV implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("turnOn");
		
	}
	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV r1=new TV();
		r1.turnOn();
		r1.batteryStatus();
		RemoteControl.info();

	}

}

//Create an interface RemoteControl with:
//o Abstract method turnOn()
//o Default method batteryStatus()
// Implement it in a class TV.