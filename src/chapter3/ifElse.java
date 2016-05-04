package chapter3;

public class ifElse {
	public static void main(String[] args) {
		
		int yourSales = 1;
		int target = 100;
		String performance;
		int bonus;

		if (yourSales >= 2 * target) {
			performance = "excellent";
			bonus = 1000;
		} else if (yourSales >= 1.5 * target) {
			performance = "fine";
			bonus = 500;
		} else {
			System.out.println("fired");
		}
	}

}