package Day3;


class Calculation{
	void addition(int x,int y) {
		int res;
		res=x+y;
		System.out.println(res);
		
	}
	void addition(int x,int y,int z) {
		int res;
		res=x+y+z;
		System.out.println(res);
	}
}
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj=new Calculation();
		obj.addition(10,20);
		obj.addition(10,20,30);
		

	}

}
