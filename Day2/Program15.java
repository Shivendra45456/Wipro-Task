package Day2;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]={1,2,3,4,5,6};
		System.out.println(marks.length);
		
		System.out.println(marks[2]);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
			
		}
		System.out.println("-------------------");
		
		for(int x:marks) {
			System.out.println(x);
		}
		
	}

}
