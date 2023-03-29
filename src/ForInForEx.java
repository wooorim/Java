
public class ForInForEx {

	public static void main(String[] args) {
		//1~9단 짝수단 만 출력
		
		for (int i = 1; i <= 9; i++) {
			if(i % 2 != 0);
			continue;}
			
			for (int j = 1; j <= 9; j++) {
				System.out.println();
			}
		}
	
	
	{
		 for (int i = 1; i <= 9; i++) {
			 
			 for (int j = 1; j <= 9; j++) {
				 System.out.println(i + " x " + j + " = " + (i * j));
			 }
			 System.out.println();
		 }
	}
	
	{
		
		for (int i = 0; i < 3; i++) {
			System.out.println("-------------");
			
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + i + "," + j + "]");
			}
			System.out.println("\n");
		}

	}

}
