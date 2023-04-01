package FromInheritance;

class Box7 {
	private double height;
	private double width;
	private double depth;

	// Constructors

	Box7() {
		height = width = depth = -1;
	}

	Box7(double h, double w, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box7(Box7 obj) {
		height = obj.height;
		width = obj.width;
		depth = obj.depth;
	}

	Box7(double len) {
		height = width = depth = len;
	}

	double volume() {
		return height * width * depth;
	}
}

class BoxWeight7 extends Box7 {
	double weight;

	BoxWeight7() { 
		super(); // default constructor of Box7 ==> -1
		weight = -1;
	}

	BoxWeight7(BoxWeight7 obj) {
		super(obj);
		weight = obj.weight;
	}

	BoxWeight7(double w, double h, double d, double m) {
		// TODO Auto-generated constructor stub
		super(h, w, d);
		weight = m;
	}

	// this constructor is used when cube is created
	BoxWeight7(double len, double m) {
		super(len);
		weight = m;
	}
}

class Shipment extends BoxWeight7{
	double cost;
	
	Shipment(Shipment obj){
		super(obj);
		cost = obj.cost;
	}
	
	Shipment(double h, double w, double d, double m, double c){
		super(h, w, d, m);
		cost = c;
	}
	
	Shipment(BoxWeight7 bw, double c){
		super(bw);
		cost = c;
	}
	
	Shipment(){
		super();
		cost = -1;
	}
	
	Shipment(double len, double m, double c){
		super(len, m);
		cost = c;
	}
	
}

public class DemoShipment {
	public static void main(String[] args) {
		
		Shipment sm1 = new Shipment(10, 20, 15, 10 ,10);
		BoxWeight7 bw1 = new BoxWeight7(10, 12, 10, 20);
		Shipment sm2 = new Shipment(bw1, 10);
		
		System.out.println("sm1 Volume, Weight, Cost : " + sm1.volume() + " " + sm1.weight + " " + sm1.cost);
		System.out.println("bw1 Volume, Weight, Cost : " + bw1.volume() + " " + bw1.weight + " " + "----");
		System.out.println("sm2 Volume, Weight, Cost : " + sm2.volume() + " " + sm2.weight + " " + sm2.cost);
	}
}
