package chapter18;
class Person {
	String name;
	int year;
	String address;
	
	public Person(String name, int year, String address) {
		this.name =name;
		this.year = year;
		this.address = address;
	}
}
class Student extends Person{
	String school;
	String major;
	int number;
	
	public Student(String name, int year, String address, String school, String major, int number) {
		super(name, year, address);
		this.school = school;
		this.major = major;
		this.number = number;
	}
}
public class HomeWork3 {

	public static void main(String[] args) {
		Student[] stu = new Student[8];
	}

}
