package firstPackage;

class Test{
	int a;
	int b;
	
	Test(int i, int j){
		a = i;
		b = j;
	}
	
	boolean equalTo(Test ob) {
		if(ob.a == a && ob.b == b) 
			return true;
		
		return false;		
	}
}

public class PassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj1 = new Test(1, 4);
		Test obj2 = new Test(1, 4);
		Test obj3 = new Test(3, 14);
		
		System.out.println("Obj1 == obj2 : " + obj1.equalTo(obj2));
		System.out.println("Obj1 == obj3 : " + obj1.equalTo(obj3));
	}
}
