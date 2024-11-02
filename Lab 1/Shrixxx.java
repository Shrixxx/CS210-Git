import java.util.Scanner;

public class Shrixxx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String card = sc.nextLine();
		
		// Variables required for code
		char let; // Character that holds the current operating number
		int num; // saves numerical form of let
		int sum1 = 0; // Added number count
		int sum2 = 0; // Doubled weird stuff count
		int count = 1; // count increaser for odd / even
		
		// If statement to check for valid string length
		if(card.length() >= 4 && card.length() <= 30) {
			
			// For loop to run through every character of card
			for(int i = card.length() - 1; i >= 0; i--) {
				let = card.charAt(i);
				num = Character.getNumericValue(let);
				
				// Checking if its on an even number
				if(i % 2 == 1) { 
					sum1 += num;
				} 
				else {
					num = num * 2;
					
					// Logic to add the double of the num, unless over 9
					if(num > 9) { // Case for over 9
						num = num - 9;
					}
					
					sum2 += num; // Case for under 10
				}
				
				// Increasing count to determine odd or even
				count++;
			}
			
		// Invalid case for too long or short a string
		} else {
			System.out.println("INVALID");
		}
		
		//Final print that checks validity of card
		if( (sum1 + sum2) % 20 == 0 ) {
			System.out.println("VALID");
		} else {
			System.out.println("INVALID");
		}
		
		// Closing scanner
		sc.close();
	}

}