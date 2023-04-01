package firstPackage;

class Box{
	double width;
	double height;
	double depth;
	
	double volume(){
//		System.out.print("Volume is:");
//		System.out.println(width*height*depth);
		return width * height * depth;
	}
}

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		myBox1.width = 10;
		myBox1.height = 10;
		myBox1.depth = 10;
		
		mybox2.height = 20;
		mybox2.width = 20;
		mybox2.depth = 20;
		
		
		vol = myBox1.volume();
		System.out.println("Volume is : "+ vol);
		vol = mybox2.volume();
		System.out.println("Volume is : "+ vol);
	}
}
