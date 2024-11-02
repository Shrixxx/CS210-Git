import java.util.Scanner;

public class Shrixxx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextInt();
		int count = 1;
		if(String.valueOf(num).length() < 2 || String.valueOf(num).length() > 10) { //If to check if it is too long or short
			System.out.println("input too long or too short");
		}
		else {
			while(num != 1) { 				// While loop to keep operating until equal 1
				System.out.println(num);
				
				if(num % 2 == 0) {			// If to check if number is even
					num = num / 2;
				} 
				else {
					num = (num * 3) + 1;	// Else operate based on odd case
				}
				count++;
			}
			System.out.println(num);			// print 1 once num == 1
			System.out.println("Steps: " + count);
		}
		sc.close();
	}
}
