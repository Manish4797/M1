package day8_1;

public class Student {

	// Encapsualtion
	// VAribales Private;
	// Getters and Setters
	// Business Logic

	// state
	private String name;
	private int age;

//	public Student(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	

	// method
	// getters and setters;

//	public Student(String name2, int age2) {
//		// TODO Auto-generated constructor stub
//	}

//	public Student(String name2, int age2) {
//		// TODO Auto-generated constructor stub
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age < 60) {
			this.age = age;
		}
	}
}
