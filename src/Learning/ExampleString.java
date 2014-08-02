package Learning;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Praveen Joseph";
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2, 7));
		System.out.println(x.charAt(3));

		String age = "30";

		int a = Integer.parseInt(age) / 2;
		System.out.println(a);

	}

}
