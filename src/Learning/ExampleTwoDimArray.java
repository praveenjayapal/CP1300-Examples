package Learning;

public class ExampleTwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDim = new int[4][3];
		// twoDim[2][1]=10;
		int temp = 10;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				twoDim[i][j] = temp;
				temp += 10;
				System.out.print(twoDim[i][j] + " ");

			}
			System.out.println();
		}
	}

}
