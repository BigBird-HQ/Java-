public class HeartRatesTest{
	public static void main(String[] args){

	HeartRatesTest heartRates = new HeartRatesTest("Joshua", "Dare", "14th December", 2010);

	System.out.printf("%s %s born %s %d, is %d years old and has a maximum heart rate of %.2f and a target heart rate range of %.2f", heartRates.getFirstName(), heartRates.getLastName(), heartRates.getDateOfBirth(), heartRates.getYearOfBirth(), heartRates.getMaxHeartRate(), heartRates.getMinTargetHeartRate(), heartRates.getMaxTargetHeartRate());


	}

}