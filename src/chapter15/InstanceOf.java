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
public static void wrapBox(Box box) { //(Box box)는 다형성이 적용되어 있음
	if(box instanceof GoldPaperBox) {
		((GoldPaperBox) box).goldWrap();
	}
	else if(box instanceof PaperBox) { //box의 주소 찾아가서 PaperBox가 메모리에 있는지 확인
		((PaperBox) box).paperWrap();
		//PaperBox p = (PaperBox)box; 형 변환 기능 
		//PaperBox클래스 안의 paperWrap메소드 호출 하고 싶어서
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
