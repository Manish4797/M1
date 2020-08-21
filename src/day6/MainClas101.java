package day6;

public class MainClas101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OOP s Concept
		
		//1. Object ra class;
		
		//Class and OBJECT
		
		//Ghar banauna???
		//naska -- blueprint;  //CLASS=== ??
		//LAptop
		//Mobile
		//SOfa
		//Internet Connection
		//Painting
		//
		
		//euta class le jati ota ni object??
		
		// naksa le euta ghar
		// euta blue print le jatai ota ni ghar banauna milxa
		 
//		
//		Laptop kajalLaptop = new Laptop();
//		kajalLaptop.brandName ="HP" ;
//		kajalLaptop.price= 500;
//		kajalLaptop.ram = 4;
//		
//		System.out.println(kajalLaptop.brandName);
//		kajalLaptop.watchNetflix();
//		kajalLaptop.createDocuments();
//		
//		System.out.println("------");
//		
//		Laptop manishLaptop = new Laptop();
//		manishLaptop.brandName ="Lenovo";
//		manishLaptop.price=1000;
//		manishLaptop.ram=8;
//		
//		System.out.println(manishLaptop.brandName);
//		manishLaptop.createDocuments();
//		manishLaptop.watchNetflix();
//		
//		System.out.println("------");
//		
//		Laptop monikaLaptop = new Laptop();
//		
//		monikaLaptop.brandName="MAc";
//		monikaLaptop.price=1000;
//		monikaLaptop.ram= 4;
//		
//		monikaLaptop.watchNetflix();
//		monikaLaptop.createDocuments();
		
		System.out.println("------");
		
		
		Mobile prabeshMobile= new Mobile();
		prabeshMobile.brandName="Pixel";
		prabeshMobile.screenSize= 5.7;
		
		prabeshMobile.showDetails();
		prabeshMobile.callPerson("Sagar");
		
		System.out.println("-----");
		
		Mobile sagarMobile= new Mobile();
		sagarMobile.brandName="iphone8";
		sagarMobile.screenSize= 6;
		
		sagarMobile.showDetails();
		sagarMobile.callPerson("Prabesh");
		
	}

}
