package Learning;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 10;
		y = -10;
		if (x > 0 && y > 0) {
			System.out.println("Positive");
		} else if (x > 0 || y > 0) {
			System.out.println("one number is positive");
		} else {
			System.out.println("Negative");
		}
	}

}
