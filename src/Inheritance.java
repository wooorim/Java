class Man {
	String name;

	Man(String name){
		this.name = name;
	}
	public void tellYourname() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man{
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		super.tellYourname();
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");

		man.tellYourInfo();

	}

}
