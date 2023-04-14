package FromInheritance;

abstract class FigureDemo{
	double dim1;
	double dim2;
	
//	Figure(){
//		System.out.println("Something");
//	}
	
	public FigureDemo(double a, double b) {
		this.dim1 = a;
		dim2 = b; //by default there will be this.dim2
	}
	
	abstract double area();
}


class RectangleDemo extends FigureDemo{

	public RectangleDemo(double a, double b) {
		super(a, b);

	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		System.out.println("Inside Area of rectangle.");
		return dim1 * dim2;
	}
}

class TriangleDemo extends FigureDemo{
	
	public TriangleDemo(double a, double b) {
		super(a, b);
	}
	
	@Override
	double area() {
		System.out.println("Inside Triangle Area");
		return dim1 * dim2;
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
//		Figure figure = new Figure(5, 4); //we can't make objects of an abstract classes
		TriangleDemo triangle = new TriangleDemo(5, 6);
		RectangleDemo rectangle = new RectangleDemo(2, 3);
		FigureDemo figureDemo;
		
		figureDemo = triangle;		
//		System.out.println("Area of triangle : " + triangle.area());  // is equivalent to 
		System.out.println("Area of triangle : " + figureDemo.area());
		
		figureDemo = rectangle;
//		System.out.println("Area of rectangle : " + rectangle.area()); // is equivalent to  
		System.out.println("Area of rectangle : " + figureDemo.area());
	}

}
