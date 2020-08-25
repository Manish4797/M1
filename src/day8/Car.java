package day8;

public class Car {

	//state
	String model;
	
	//method overloading
	// by changing no of arguments , by changing datatype
	//behaviour
	public void drives() {
		System.out.println("Driving Normally");
	}
	
	public void drives(String typeOfRoad) {
		System.out.println("Driving in : "+ typeOfRoad);
	}

	//error
//	public void drives(String road) {
//		System.out.println("Driving in : "+ road);
//	}
	
	public void drives(int noOfPassengers) {
		System.out.println("Driving with : "+ noOfPassengers);
	}
	
	public void drives(String typeOfRoad, int noOfPassengers) {
		System.out.println("Driving in : "+ typeOfRoad + " with this passengers : "+ noOfPassengers);
	}
	public void drives(int noOfPassengers, String typeOfRoad ) {
		System.out.println("********Driving in : "+ typeOfRoad + " with this passengers : "+ noOfPassengers);
	}
	
	public void addNumbers(int a, int b) {
		System.out.println(a+b);
	}
	public void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
}
