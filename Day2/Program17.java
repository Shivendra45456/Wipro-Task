package Day2;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//menu driven calculator
		Scanner sc=new Scanner (System.in);
		int choice;
		double num1,num2,result;
		
		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice :");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result=num1+num2;
				System.out.println("Result is "+result);
				break;
				
			case 2:
				System.out.println("Enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result=num1-num2;
				System.out.println("Result is "+result);
			    break;
			    
			case 3:
				System.out.println("Enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result =num1*num2;
				System.out.println("Result is "+result );
				break;
				
			case 4:
				System.out.println("Enter two numbers");
				num1=sc.nextDouble();
				num2=sc.nextDouble();
				result =num1/num2;
				System.out.println("result is"+result );
				break;
				
			case 5:
				
				System.out.println("Exit calculation");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}while (choice !=5);

	}

}
