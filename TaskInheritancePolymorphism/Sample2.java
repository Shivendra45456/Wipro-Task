package TaskInheritancePolymorphism;


class Calculator{
	int add(int x, int y) {
		return x+y;
		
	}
	double add(double x, double y) {
		return x+y;
	}
	String add(String x, String y) {
		return x+y;
		
	}

}
public class Sample2 {
	public static void main(String[] args) {
		
		Calculator  c=new Calculator();
		System.out.println(c.add(10, 20));
		System.out.println(c.add(10, 20.2));
		System.out.println(c.add("Hello", "Ram"));
		
	}

}
