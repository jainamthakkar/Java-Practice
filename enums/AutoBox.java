package enums;

public class AutoBox {
	public static void main(String[] args) {
		
		Integer iob = 100;
		Double dob = 12.5;
		
		dob = iob + dob;
		System.out.println("dob after expression : " + dob);
	}
}
