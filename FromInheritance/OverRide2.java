package FromInheritance;

class Figure{
	
	double dim1;
	double dim2;
	
	Figure(double d1, double d2){
		dim1 = d1;
		dim2 = d2;
	}
	
	double area() {
		System.out.println("Area For Figure is undefined");
		return 0;
	}
}

class Rectangle extends Figure{
	
	Rectangle(double d1, double d2){
		super(d1, d2);
	}
	
	double area() {
		System.out.println("Inside Area of Rectangle : ");
		return dim1 * dim2;
	}
}

class Triangle extends Figure{
	
	Triangle(double d1, double d2){
		super(d1, d2);
	}
	
	double area() {
		System.out.println("Inside Area of Triangle : ");
		return (dim1 * dim2)/2;
	}
}

public class OverRide2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f = new Figure(5, 10);
		Rectangle r = new Rectangle(10, 4);
		Triangle t = new Triangle(10, 10);
		
		Figure figref;
		
		figref = r;
		System.out.println( figref.area());
		
		figref = t;
		System.out.println( figref.area());
		
		figref = f;
		System.out.println( figref.area());
	}

}
