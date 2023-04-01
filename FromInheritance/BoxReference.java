package FromInheritance;

public class BoxReference {

	public static void main(String[] args) {
		BoxWeight bw1 = new BoxWeight(3, 5, 7, 9);
		Box b1 = new Box();
		
		System.out.println("Volume of BW1 : " + bw1.volume());				//    Box --> Parent --> File name ----> ExtendsBox
		System.out.println("Weight of B1 : " + bw1.weight);					//	   |
																			//  WeightBox --> Child
		System.out.println();
		
		b1 = bw1;
		System.out.println("Volume of B1 : " + b1.volume()); // volume is defined in Box class
//		System.out.println("Weight of b1 : " + b1.weight);  //raise error bcs weight is not defined in box class
		
	}
}
