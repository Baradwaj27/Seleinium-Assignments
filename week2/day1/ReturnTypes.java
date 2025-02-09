package week2.day1;

public class ReturnTypes {
	public int applyBrake() {
		System.out.println("Brake");
		return 7;
	}
	
	public void applyHorn() {
		System.out.println("Applied horn");
	}
	
	

	public static void main(String[] args) {
		ReturnTypes carOptions=new ReturnTypes();
		
		System.out.println(carOptions.applyBrake());
		
		carOptions.applyHorn();
	}
}

