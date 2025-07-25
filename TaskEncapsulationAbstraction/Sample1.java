package TaskEncapsulationAbstraction;

class BankAccount{
	public int AccountNumber;
	private int balance; 
	
	public BankAccount(int accountNumber, int balance) {
		super();
		AccountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	
	public int  getBalance() {
		return this.balance;
		
	}
	public void deposit(double x) {
		this.balance+=x;
		
	}
	public void withdraw(double x){
  		this.balance-=x;
	}
	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 =new BankAccount(123456789,12000);
		System.out.println(acc1.getBalance());
		acc1.withdraw(2000);
		System.out.println(acc1.getBalance());
		acc1.deposit(5000);
		System.out.println(acc1.getBalance());
		

	}

}
//Task 3: Create a BankAccount Class
// Fields: accountNumber, balance (private)
// Methods: deposit(double), withdraw(double), getBalance()
// Use encapsulation to protect balance.