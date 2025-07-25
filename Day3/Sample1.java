package Day3;


class Person {
	int id=100;
	String name ="Bob";
	
	public void getInfo() {
		System.out.println(id+"  "+name);
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.getInfo();

	}

}
