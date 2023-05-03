class Employee{
	protected String name;
	protected int age;
	protected String address;
	protected String position;
	protected String salary;
	
	public Employee(String name, int age, String address, String position, String salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.position = position;
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + " 나이: " + age + " 주소: " + address + " 부서: " + position);
	}
}
class Regular extends Employee {
	public Regular(String name, int age, String address, String position, String salary) {
		super(name, age, address, position, salary);
	}
}
class Temporary extends Regular {
	public Temporary(String name, int age, String address, String position, String salary) {
		super(name, age, address, position, salary);
	}
}
public class PersonInfo {

	public static void main(String[] args) {
		Employee e = new Employee("홍길동", 24, "111-2222", "비정규직", "2500만원");
		e.printInfo();
		
		Employee r = new Regular("홍길동", 24, "111-2222", "비정규직", "2500만원");
		r.printInfo();
		
		
	}

}
