class MobilePhone {
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~grom " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String androidVer) {
		super(num);
		this.androidVer = androidVer;
	}
	public void palyApp() {
		System.out.println("App is running in " + androidVer);
	}
}
public class polymorphism {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-7777", "Nouget");
		MobilePhone ph2 = new SmartPhone("010-999-3333", "Nouget");
		
		ph1.answer();
		ph1.palyApp();
		System.out.println();
		
		ph2.answer();
		//ph2.playApp();
	}

}
