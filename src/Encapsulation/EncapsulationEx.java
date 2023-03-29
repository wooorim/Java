package Encapsulation;

//가위 바위 보 게임 캡슐화 예제
//1. 가위 바위 보 입력받기
//2. 컴퓨터 랜덤생성하기
//3. 승부 결정 짓기

//프로그래밍 방법
//첫번째 main안에 디 때려 넣기 != 객체 지향 프로그래밍이 아니다

class Rsp {
	void inputRsp() {
		System.out.println("가위 바위 보 입력받기");
	}
	void randomRsp() {
		System.out.println("컴퓨터 랜덤생성하기");
	}
	void result() {
		System.out.println("승부 결정 짓기");
	}
	void run() { //위 3개의 함수를 run()함수에 담아주면 run()함수만으로 저부의 함수를 호출가능.
		inputRsp();
		randomRsp();
		result();
	}
}
public class EncapsulationEx {

	public static void main(String[] args) {
		Rsp rsp = new Rsp();
		
		rsp.run();
	}

}
