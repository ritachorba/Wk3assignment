
public class HundredMeterDash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 13: make array of 100m dash times for an individual, create method to find average time
		
		double dashtimes[] = {11.2, 11.56, 12.13, 11.24, 11.98};
		double ave = averageDash (dashtimes);
		System.out.println("Her average 100m dash time is " + ave);

		
	}

	public static double averageDash (double [] dashtimes) {
		double sum = 0;
		double ave = 0;
		for (double dashtime : dashtimes) {
			sum += dashtime;
			ave = sum/dashtimes.length;
		}
		return ave;
		
	}
}
