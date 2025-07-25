package TaskJava8InterfaceEnhancements;


interface Logger{
	default void logInfo() {
		System.out.println("logInfo");
	}
	static void logError() {
		System.out.println("logError");
	}
}

class AppLogger implements Logger{
	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppLogger a1=new AppLogger();
		a1.logInfo();
		Logger.logError();

	}

}

//Task 10: Default & Static Methods
// Create interface Logger with:
//o default void logInfo()
//o static void logError()
// Class AppLogger implements Logger
// Call both methods in main().
