package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class SumOfDigts{

    //[Approach 1] Digit Extraction - O(log10n) Time and O(1) Space
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
           //Extract the last digit
            int last = n % 10;

            //Add the last digit
            sum += last;

            //Remove the last digit
            n /= 10;
        }
        return sum;
    }

    //[Approach 2] Using Recursion - O(log10n) Time and O(log10n) Space
    static int sum_of_digit(int n){

        //Base case
        if(n == 0)
            return 0;

        //recursive case
        return (n % 10) + sum_of_digit(n / 10);
    }

    //[Approach 3] String Conversion - O(d) Time and O(d) Space (Here d = digits)
    static int sumOfdig(int n){
        // Convert number to string
        String s = Integer.toString(n);
        int sum = 0;
        // Loop through each character, convert to digit, and add to sum
        for (char ch : s.toCharArray()){
            sum += ch - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     System.out.println(sum_of_digit(n));
    }
}
