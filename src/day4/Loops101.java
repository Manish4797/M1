package day4;

public class Loops101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// index initialization
		// condition
		// increment or decrement

		// while loops
//		int index =1;
//		while(index<=100) {
//			System.out.println(index + " : M1");
//			index++;
//		}

		// do while
//		int index = 100;
//
//		do {
//			System.out.println("M1: "+ index);
//			index++;
//		} while (index <= 10);
//condition is false
	
	//for
//		for (int index = 0; index <= 100; index=index+2) {
//			System.out.println(index);
//		}
		
	//for each;
		//A group of data stacked??
		//Array?? --> a collection of similar data type;
		
		
		//1,2,5,8,9,4,11
		
		//array static==>   size fix;
		// 0,1,2,3,4,5,6
		
		int a[]= new int[7];
		a[0]=1;
		a[1]=2;
		a[2]=5;
		a[3]=8;
		a[4]=9;
		a[5]= 4;
		a[6]=11;
	//	a[7]==?
		
	//	System.out.println(a[7]);
	//	System.out.println(a.length); 7
		
//		for(int index=0; index<a.length ; index++) {
//			System.out.println(a[index]);
//			//
//		}
		
		for(int asdf :  a) {
			//asdf==a[0]
			//asdf==a[1]
			//asdf==a[2]
			System.out.println(asdf);
		}
		
		//array== static
		
		
	
	}

}
