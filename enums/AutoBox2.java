package enums;

public class AutoBox2 {

	public static void main(String[] args) {
		
		Boolean b = true; 
		if(b) // b is auto-unboxed from Boolean to boolean
			System.out.println("b is : " + b);
		
		Character ch = 'J'; // box a char
		char ch2 = ch; //auto unbox a char
		System.out.println("ch2 is " + ch2);
	}
}
