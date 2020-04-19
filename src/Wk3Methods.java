
public class Wk3Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method string word Hello, int n = 3  and returns the word concatenated to itself n times, HelloHelloHello
		
		String word = "Hello";
		int n = 3;
		System.out.println(concatWords(word, n));
		
		
		String firstName = "Michael";
		String lastName = "Burnham";
		System.out.println(fullName(firstName, lastName));
		

		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93, 14};
		boolean isOver = isHundred(ages);
		System.out.println(isOver);
		
		double rainFall[] = {3.5, 2.1, 6.8, 15.2, 1.1};
		double average = doubleArray(rainFall);
		System.out.println(average);
		
		double rainOhio[] = {2.1, 5.8, 3.3, 3.1};
		double rainArizona[] = {1.1, 1.8, 1.3, 1.2};
		boolean rain = isGreater(rainOhio, rainArizona);
		System.out.println(rain);
		
		boolean isHotOutside = true;
		double moneyInPocket = 15.50;
		boolean getDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(getDrink);
		
	}     
	
	public static String concatWords(String word, int n) {
		String repeated = new String(new char[n]). replace("\0", word);         //Question 7
		return repeated;
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;                          //Question 8
		return fullName;
	}
	
	public static boolean isHundred(int[] ages) {
		int sum = 0;
		boolean isOver = true;
		for (int age : ages) {													//Question 9
			sum += age;
			isOver = sum > 100;
		}
		return isOver;
	}	
		
	public static double doubleArray(double[]numbers) {
		double total = 0.00;
		double average = 0.00;													//Question 10
		for (double number : numbers) {
			total += number;
			average = total/numbers.length;
		}
		return average;	
		
	}
		
	public static boolean isGreater(double[] rainOhio, double [] rainArizona) {  
		return doubleArray(rainOhio) > doubleArray(rainArizona);				//Question 11
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean getDrink = isHotOutside && (moneyInPocket > 10.50);
		return getDrink;														//Question 12
	}
	
	
	
	
	

}
