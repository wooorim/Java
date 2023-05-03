package chapter15;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}


public class InstanceOf {
public static void wrapBox(Box box) { //(Box box)�� �������� ����Ǿ� ����
	if(box instanceof GoldPaperBox) {
		((GoldPaperBox) box).goldWrap();
	}
	else if(box instanceof PaperBox) { //box�� �ּ� ã�ư��� PaperBox�� �޸𸮿� �ִ��� Ȯ��
		((PaperBox) box).paperWrap();
		//PaperBox p = (PaperBox)box; �� ��ȯ ��� 
		//PaperBoxŬ���� ���� paperWrap�޼ҵ� ȣ�� �ϰ� �;
	}
	else {
		box.simpleWrap();
	}
}
	public static void main(String[] args) {
			
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
	}

}
