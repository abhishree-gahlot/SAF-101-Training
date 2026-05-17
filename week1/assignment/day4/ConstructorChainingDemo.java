package week1.assignment.day4;

public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println();

		Student student2 = new Student("Abhishree");
		System.out.println();

		Student student3 = new Student("Abhishree", 22);
	}
	
}


class Student {

	String name;
	int age;

	Student() {
		this("Default User", 18);
		System.out.println("Default Constructor Called");
	}

	Student(String name) {
		this(name, 20);
		System.out.println("Single Parameter Constructor Called");
	}

	Student(String name, int age) {

		this.name = name;
		this.age = age;
		System.out.println("Parameterized Constructor Called");
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
	}
}