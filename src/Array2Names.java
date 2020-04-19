import java.util.Arrays;

public class Array2Names {

	public static void main(String[] args) {
		
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int totalLetters = 0;
		for (String name : names) {  
			totalLetters += name.length();
		}
		
		int averageLetters;
		averageLetters = totalLetters / names.length; 
		System.out.println("The average number of letters per name is " + averageLetters + "."); //Question 2.a
	
		for (String name : names) {
			System.out.print(name + " ");
		}												//Question 2.b
		
		System.out.println("");
		
		String lastName = names[names.length-1];
		System.out.println("The last element of the array is " + lastName);    //Question 3
		String firstName = names[0];
		System.out.println("The first element of the array is " + firstName);  //Question 4
	
		int [] nameLengths = new int [names.length];						
		for (int i = 0; i < names.length; i ++) {							
			nameLengths[i] = names[i].length();  
		}																		//Question 5
		
		int sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
			System.out.println(sum);											//Question 6
		}
		
		
	
	}

}
