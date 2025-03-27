package package_example1;

import package_example.InterestCalculationExample;

public class TaxCalculation {
	public static void main(String[] args) {
		int intrerstAmount = new package_example.
				InterestCalculationExample().calculateInterest(1000, 34);
		System.out.println("Interest Amount " + intrerstAmount);
		
		int interestAmount1 = new InterestCalculationExample()
				.calculateInterest(1000, 4);
		System.out.println("Interest Amount1 is  " + interestAmount1);
	}

}
