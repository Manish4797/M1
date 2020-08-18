package day5;

public class Function101 {

	
	//re use
	public static void sayHi() {
		System.out.println("Hello");
		System.out.println("Hi");
	}
	
	//num1=15
	//num2=30;
	public static int addNum(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	
	public static void printName(String name) {
		
		System.out.println("Hello : " + name);
		
	}
	
	public static double valueOfPI() {
		System.out.println("3.1416");
		return 3.1416;
	}
	
	
	//4 types
			//on the basis of return and arguments
			//1. Function with arguments and no return type  ok
	
			public static void myName(String name) {
				System.out.println(name);
		
			}
	
			public static void addNumber(double num1, double num2) {
				System.out.println(num1+num2);
			}
			
			//2. Function with arguments and return type  ok
			
			public static String showMyFriendsName(String name1, String name2) {
				
				String concat = name1 + " -- " + name2;
				
				return concat;
				
			}
			
			//3. Function with no arguemnets and no return type   ok
			
			public static void howIsJavaTrainer() {
				System.out.println("He is shityttt");
			}
			
		
			//4. Function with no argumemts and return type  ok
			
			public static String myName() {
				return " Apple";
			}
			
			
			
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data= showMyFriendsName("Apple", "Banana");
		System.out.println(data);
		
		
		//function or method
		//a bunch of code packed together?
		
//		sayHi();
//		sayHi();
//		sayHi();
		
		//sum=30;
		int asdf = addNum(15,30);
		System.out.println(asdf);
		
		System.out.println("----");
		printName("Urgyen");
		
		
		//
		//System.out.println(addNum());
		
		
		
		
		double dataFromMethods= valueOfPI();
		System.out.println(dataFromMethods + " : value of PI ");
		
		
		String firstName= myName();
		System.out.println(firstName);
		
		
	}

}
