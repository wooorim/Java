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
		System.out.println("�̸�: " + name + " ����: " + age + " �ּ�: " + address + " �μ�: " + position);
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
		Employee e = new Employee("ȫ�浿", 24, "111-2222", "��������", "2500����");
		e.printInfo();
		
		Employee r = new Regular("ȫ�浿", 24, "111-2222", "��������", "2500����");
		r.printInfo();
		
		
	}

}
