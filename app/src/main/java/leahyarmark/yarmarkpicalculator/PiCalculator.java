package leahyarmark.yarmarkpicalculator;

public class PiCalculator {

	public double calculate(long l) {
		
		double pi = 0;
		double numerator = 4;
		double denominator = 1;
		boolean positive = true;
		
		for (int i = 0; i < l; i++) {

			if (positive) {
				pi += (numerator / denominator);
			}

			else {
				pi -= (numerator / denominator);
			}

			denominator +=2;
			// change boolean
			positive = !positive;
		}
		return pi;

	}
}
