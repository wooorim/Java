class Person extends Object{
	private String name;

	Person(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;

			if (this.name.equals(person.name))
				return true;
		}
		return false;
	}
}

public class Equals2 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1.equals(new Person("ȫ�浿")));
		System.out.println(p1.equals(new Person("�ָ���")));
	}

}
