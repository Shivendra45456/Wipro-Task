package Day3;



class Student {
	int s_id;
	String s_name;
	Student(){
		s_id=101;
		s_name="john";
		System.out.println("Constructor called");
	}
	public void getInfo() {
		System.out.println(s_id+"  "+s_name);
	}
}
public class Sample2 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.getInfo();
	}

}
