package FromInheritance;

//Inheritance + Use of Super

class Box{
	double height;
	double width;
	double depth;
	//***********************************************
	Box(){
		height = width = depth = -1;		
	}
	
	Box(double h, double w, double d){
		width = w;
		height = w;
		depth = d;
	}
	
	Box(Box obj){
		obj.height = height;
		obj.width = width;
		obj.depth = depth;		
	}
	Box(double len){
		width = height = depth = -1;
	}
	
//	***********************************************
	double volume() {
		return height * width * depth;
	}	
}


class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double h, double w, double d, double m){
//		width = w;
//		height = h;
//		depth = d;
		
		//Alternative ==> it will call to Box(parameters) constructor
		super(h, w, d);		
		
		weight = m;		
	}
}

public class ExtendsBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight bw1 = new BoxWeight(10, 20, 30, 40);
		BoxWeight bw2 = new BoxWeight(1, 2, 3, 4);
		
		System.out.println("Volume of 1st : " + bw1.volume());
		System.out.println("Weight of 1st : " + bw1.weight);

		System.out.println();
		
		System.out.println("Volume of 2nd : " + bw2.volume());
		System.out.println("Weight of 2nd : " + bw2.weight);
		
	}

}
