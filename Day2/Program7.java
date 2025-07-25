package Day2;

public class Program7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int percentage=34;
		if(percentage >=85 && percentage<=100) {
			System.out.println("FSD");
		}
		else if(percentage >=60 && percentage<85) {
			System.out.println("First class");
		}
		else if(percentage >=35 && percentage<60) {
			System.out.println("Pass class");
		}
		else if(percentage >=0 && percentage<35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter Percentage Between 1 and 100");
		}

	}
}
