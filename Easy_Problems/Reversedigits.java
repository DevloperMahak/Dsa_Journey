package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class Reversedigits{

    // [Approach 1] Reversing Digit by Digit - Time Complexity - O(log n) Space Complexity - O(1)
    public static int Reverse_digit(int n){
        int revnum = 0;
        while (n > 0){
            revnum = revnum * 10 + n % 10;
             n = n / 10;
        }
        return revnum;
    }

    // [Approach 2] Using Recursion - Time Complexity - O(log n) Space Complexity - O(log n)
    public static void reversedigit(int n , int [] revnum, int [] basepos){
         if(n > 0) {
             reversedigit(n / 10, revnum, basepos);
             // Add current digit with its base position
             revnum[0] += (n % 10) * basepos[0];
             basepos[0] *= 10;
         }
    }

    // [Approach 3] Using String - Time Complexity - O(log n) Space Complexity - O(1)
    public static int reverse_digit(int n){

        // converting number to string
        StringBuffer s = new StringBuffer(String.valueOf(n));

        // reversing the string
        s.reverse();

        // converting string to integer
        n = Integer.parseInt(String.valueOf(s));

        // returning integer
        return n;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(reverse_digit(n));

        //[Approach 2]
        int [] revnum = {0};
        int [] basepos = {1};
        reversedigit(n, revnum,basepos);
        System.out.println(revnum[0]);
    }
}