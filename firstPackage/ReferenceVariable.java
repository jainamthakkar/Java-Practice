package firstPackage;

class Test3{
	
	private int i;
	
	Test3(int k) {i= k;}
	
	int geti() {
		return i;
	}
	
	void seti(int k) {
		if(k > 0)
			i = k;
	}
}


public class ReferenceVariable { // var i; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var obj = new Test3(10);
		
		System.out.println("Obj.geti() : " + obj.geti());
		obj.seti(14);
		System.out.println("Obj.geti() : " + obj.geti());
	}

}
