package Oops;

interface Bank{
	
	public abstract void moneyTransfer();
	public abstract void checkBalance();
}


public class HDFCBank implements Bank{

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();
		hb.moneyTransfer();
		hb.checkBalance();
	}

	@Override
	public void moneyTransfer() {

		System.out.println("Money Transfer from HDFC.....");
	}

	@Override
	public void checkBalance() {

		System.out.println("Checking Balance from HDFC.....");
	}

}

class AxisBank implements Bank{

	@Override
	public void moneyTransfer() {

		System.out.println("Money Transfer from Axis.....");

	}

	@Override
	public void checkBalance() {

		System.out.println("Checking Balance from Axis.....");

	}
	
	public static void main(String[] args) {
		AxisBank ax = new AxisBank();
		ax.moneyTransfer();
		ax.checkBalance();
	}
	
}
class BankDemo{
	
	public static void main(String[] args) {
		Bank b;
		b = new AxisBank();
		b.checkBalance();
		b.moneyTransfer();
		
		b = new HDFCBank();
		b.checkBalance();
		b.moneyTransfer();
		
	}
}
