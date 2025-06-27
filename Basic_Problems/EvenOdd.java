package Logic_Building.Basic_Problems;

import java.util.Scanner;

public class EvenOdd{
    // Approach 1 - By Finding Remainder
    //Time Complexity - O(1)
    //Space Complexity - O(1)
    public static boolean isEven(int n){
        return (n % 2 == 0);
    }

    // Approach 2 - Using Bitwise AND operator (The last bit of Odd number is always 1 and Even number is always 0)
    //Time Complexity - O(1)
    //Space Complexity - O(1)
    public static boolean checkEven(int n){
        if((n & 1) == 0){
            return true;
        }else{
            return false;
        }
    }

    // Approach 3 - Using Bitwise Shift operator (Right shifting n >> 1 removes the last bit. Shifting back restores it. If the result matches the original number, it's even.)
    //Time Complexity - O(1)
    //Space Complexity - O(1)
    public static boolean Even(int n){
        if(n == (n >> 1) << 1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(isEven(n) == true){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }

}