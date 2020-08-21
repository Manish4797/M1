package day6;

public class Mobile {

	//state
	String brandName;
	double screenSize;
	
	
	
	//behaviour
	
	public void showDetails() {
		System.out.println(brandName  + " - " +  screenSize);
	}
	
	public void callPerson(String name) {
		System.out.println("CAlling : " + name);
	}
	
}
