
public class DoubleArray {

	public static void main(String[] args) {
		int[][] numArr = new int[4][4];

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + "\t");
			}
			System.out.println(" ");
		}

	}

}
