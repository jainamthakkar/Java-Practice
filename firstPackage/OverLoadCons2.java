package firstPackage;

//constructor overloading && Object as a parameter

class Box1{
	double width;
	double height;
	double depth;	
	
	Box1(){
		width = height = depth = -1;
	}

	//object as a parameter in constructor
	Box1(Box1 obj){
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	
	Box1(double w, double h, double d){
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
	double volume() {
		return this.width * this.height * this.depth;
	}
}


public class OverLoadCons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 obj1 = new Box1();
		Box1 obj2 = new Box1(2, 3, 4);
		Box1 obj3 = new Box1(obj2);
		
		System.out.println("Obj1 : " + obj1.volume());
		System.out.println("Obj2 : " + obj2.volume());
		System.out.println("Obj3 : " + obj3.volume());
	}

}
