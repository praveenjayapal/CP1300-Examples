
public class MilesToKm {

	public static void main(String[] args) {
		double km = 0;
		int miles = 1;
		for (int i = 1; i<=100; i++){
			km = miles/0.62;
			String kilo = String.format("%.2f", km);
			System.out.println("Miles " + miles + " - " + "Km " + kilo);
			miles++;
		}
	}

}
