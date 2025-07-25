package TaskExceptionHandling;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		try {
			int res=num/100;
			System.out.println(res);
			
		}
		
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}

//Task 1: Try-Catch
// Take user input and divide 100 by the entered number.
// Use try-catch to catch division by zero.