package week4.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash On Delivery");		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments");
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments");		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Record Payment Details");
		
	}
	
	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
		
		
	}

}
