package Encapsulation;

//���� ���� �� ���� ĸ��ȭ ����
//1. ���� ���� �� �Է¹ޱ�
//2. ��ǻ�� ���������ϱ�
//3. �º� ���� ����

//���α׷��� ���
//ù��° main�ȿ� �� ���� �ֱ� != ��ü ���� ���α׷����� �ƴϴ�

class Rsp {
	void inputRsp() {
		System.out.println("���� ���� �� �Է¹ޱ�");
	}
	void randomRsp() {
		System.out.println("��ǻ�� ���������ϱ�");
	}
	void result() {
		System.out.println("�º� ���� ����");
	}
	void run() { //�� 3���� �Լ��� run()�Լ��� ����ָ� run()�Լ������� ������ �Լ��� ȣ�Ⱑ��.
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
