package firstPackage;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  new int[1];
		Scanner scanner = new Scanner(System.in);
		arr[0] = scanner.nextInt();
		scanner.close();

		System.out.println("jainam" + arr[0]);
	}

}
