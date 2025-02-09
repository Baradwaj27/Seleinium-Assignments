package week2.day1;

public class Access1 {
	
	public void depositAmount() {
    System.out.println("Deposit");		

	}
	
	private void withdrawnAmount() {
		System.out.println("Withdrawn");

	}
	
	void knowATM() {
		System.out.println("1234");
	}
	

	public static void main(String[] args) {
		Access1 bank=new Access1();
		bank.depositAmount();
		bank.withdrawnAmount();
		bank.knowATM();

	}

}
