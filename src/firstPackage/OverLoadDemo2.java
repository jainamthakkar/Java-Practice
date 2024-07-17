package firstPackage;

class OverLoadDemo2 {

	public static void main(String[] args) {

		Addition a1 = new Addition();
		a1.add(20);
		a1.add(30, 50);
		a1.add(10, 30, 60);
	}
}

class Addition {

	int i, j, k;

	void add(int a) {
		i = a;
		System.out.println("add i=" + i);
	}

	void add(int a, int b) {// overloaded add()

		i = a;
		j = b;
		System.out.println("add i + j = " + (i + j));
	}

	void add(int a, int b, int c) {// overloaded add()

		i = a;
		j = b;
		k = c;
		System.out.println("add i+j+k=" + (i + j + k));
	}
}

