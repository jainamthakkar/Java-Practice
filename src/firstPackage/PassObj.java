package firstPackage;

class Test{
	int a;
	int b;

	Test(){
		System.out.println("RAM");
	}

	Test(int i, int j){
		a = i;
		b = j;
	}

	Test(Test obj){
		this.a = obj.a;
		this.b = obj.b;
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

		Test obj4 = new Test(obj3);
		
		System.out.println("Obj1 == obj2 : " + obj1.equalTo(obj2));
		System.out.println("Obj1 == obj3 : " + obj1.equalTo(obj3));
	}
}
