package FromInheritance;

class Box6 {
	private double height;
	private double width;
	private double depth;

	// Constructors

	Box6() {
		height = width = depth = -1;
	}

	Box6(double h, double w, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box6(Box6 obj) {
		height = obj.height;
		width = obj.width;
		depth = obj.depth;
	}

	Box6(double len) {
		height = width = depth = len;
	}

	double volume() {
		return height * width * depth;
	}
}

class BoxWeight6 extends Box6 {
	double weight;

	BoxWeight6() { 
		super(); // default constructor of Box6 ==> -1
		weight = -1;
	}

	BoxWeight6(BoxWeight6 obj) {
		super(obj);
		weight = obj.weight;
	}

	BoxWeight6(double w, double h, double d, double m) {
		// TODO Auto-generated constructor stub
		super(h, w, d);
		weight = m;
	}

	// this constructor is used when cube is created
	BoxWeight6(double len, double m) {
		super(len);
		weight = m;
	}
}

public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		BoxWeight6 bw1 = new BoxWeight6(1, 2, 3, 4);
		BoxWeight6 bw2 = new BoxWeight6(2, 2, 3, 3); // h, w, d, m
		BoxWeight6 bw3 = new BoxWeight6(); // default
		BoxWeight6 bw4 = new BoxWeight6(3, 2); // cube ==> (h = w = d) , m
		BoxWeight6 bw5 = new BoxWeight6(bw1); // clone of bw1

		System.out.println("Volume and weight of BW1 : " + bw1.volume() + " " + bw1.weight);
		System.out.println();

		System.out.println("Volume and weight of BW2 : " + bw2.volume() + " " + bw2.weight);
		System.out.println();

		System.out.println("Volume and weight of BW3 : " + bw3.volume() + " " + bw3.weight);
		System.out.println();

		System.out.println("Volume and weight of BW4 : " + bw4.volume() + " " + bw4.weight);
		System.out.println();

		System.out.println("Volume and weight of BW5 : " + bw5.volume() + " " + bw5.weight);
		System.out.println();

	}

}
