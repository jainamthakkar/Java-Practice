package firstPackage;

class SelectionSortDemo {

	public static void main(String[] args) {

		int a[] = { 5, 2, 9, 3,9, 4, 5, 4, 1, 8, 6, 7 };
		
		for (int i = 0; i < a.length - 1; i++) 
		{			
			int min = a[i];
			int minIndex = i;
			
			for (int j = i+1; j < a.length; j++) 
			{
				if (min > a[j]) 
				{
					min = a[j];
					minIndex = j;
				}

			} 			

//			if (minIndex != i) 
//			{
				a[minIndex] = a[i];
				a[i] = min;
//			}

		} 

		for (int temp : a)  
			System.out.print(temp + ", ");		

	}
}// class