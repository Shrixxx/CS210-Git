import java.util.Scanner;
public class Shrixxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many items will be in the array; ");
        int amount = sc.nextInt();
        sc.nextLine();
        String [] sar = new String[amount];

        for(int i = 0; i < sar.length; i++) {
            System.out.print("Item " + (i+1) + "; ");
            sar[i] = sc.nextLine();
        }

        sar = sorter(sar);

        System.out.println(" ");
        System.out.println("This is the ordered list; ");
        for (String word : sar) {
            System.out.print(word + ", ");
        }

        System.out.println(" ");
        sc.close();
    }

    public static String[] sorter(String[] arr) {

        String w1 = "";
        String w2 = "";
        Boolean runStop = false;
        
        while(runStop == false) {
            for(int ii = 0; ii < (arr.length - 1); ii++){
                w1 = arr[ii];
                w2 = arr[ii + 1];
    
                if(w1.length() > w2.length()) {
                    arr[ii] = w2;
                    arr[ii + 1] = w1;
                    
                }
                else if(w1.length() == w2.length()) {
                    if(Character.getNumericValue(w1.charAt(0)) < Character.getNumericValue(w2.charAt(0))) {
                        arr[ii] = w2;
                        arr[ii + 1] = w1;
                    }
                }
            }

            runStop = orderCheck(arr);
        }

        return arr;
    }

    public static boolean orderCheck(String[] arr) {

        // System.out.println("Checking");   Line used for debugging

        boolean check = true;
        String w1 = "";
        String w2 = "";

        for(int iii = 0; iii < (arr.length - 1); iii++) {

            w1 = arr[iii];
            w2 = arr[iii + 1];

            if(w1.length() > w2.length()){
                check = false;
            }
            if(w1.length() == w2.length()) {
                if(Character.getNumericValue(w1.charAt(0)) < Character.getNumericValue(w2.charAt(0))) {
                    check = false;
                }
            }
        }
 
        // System.out.println("Returning " + check);   Line used for debugging
        return check;
    }
}
