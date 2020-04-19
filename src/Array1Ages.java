
public class Array1Ages {

	public static void main(String[] args) {
	
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93, 14};
		int ageFirst = ages[0];
		int ageLast = ages[ages.length - 1];
	 
			System.out.println(ageLast - ageFirst); //question 1a, 1b
		
		int sumAge = 0;
		for (int indexCount = 0; indexCount < ages.length; indexCount++) {
			 sumAge = sumAge + ages[indexCount];
			 
		}
		
		int average = sumAge/ages.length;
			System.out.println(average);           //question 1c
		
		
				
	}
		
			
	

}
