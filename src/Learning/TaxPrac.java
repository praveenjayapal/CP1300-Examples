package Learning;

public class TaxPrac {

	public static void main(String[] args) {
		double salary = 20000;
		double total = 0;
		if (salary < 15000) {
			total = salary * .10;
		} else if (salary >= 15000 && salary < 40000) {
			total = salary * .20;
		} else {
			total = salary * .30;
		}
		System.out.println(salary + " After tax " + (salary - total));
	}

}
