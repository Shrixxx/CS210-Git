import java.util.Scanner;
public class Shrixxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // declaring variable to decide which prime number to print
        int inc = 2; // declaring int that the prime checker will start from
        
        if(n < 1 || n > 1000 ) {
            System.out.println("Input invalid");
        } else {
            n = primeChecker(n, inc);
            inc = 2;
            primeChecker(n, inc);
        }
        

        sc.close();
    }

    public static int primeChecker(int n, int inc) {
        boolean is = true; // boolean to detect a non prime number
        while(n > 0) {
            for(int i = 2; i < inc; i++) { // loop that runs until current number to check if its prime
                is = true;
                if (inc % i == 0) { // if to check if current number modulus any numer leaves no remainder
                    is = false;
                    break;
                }
            }
            if(is == true) { // if to check if current number is prime
                n--; // every time a prime is found decrement n
                // System.out.println(inc);
            }
            inc++;
        }
        System.out.println((inc - 1)); // printing out the final prime number
        return (inc - 1);
    }
}
