package Logic_Building;

import java.util.Scanner;

class Naturalno_Sum{

    //[Naive Approach] Using Loop - O(n) Time and O(1) Space
    static int findSum(int n) {
        int sum = 0;
        // iterating over all the numbers
        // between 1 to n
        for (int x = 1; x <= n; x++)
            sum = sum + x;
            return sum;
    }

    static int findTotal(int n)
    {
        //[Expected Approach] Formula Based Method- O(1) Time and O(1) Space
        // Using mathematical formula to compute
        // sum of first n natural numbers
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        System.out.println("Enter the natural number till which you have to find the sum : ");
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
        System.out.println("Sum of "+ n + " natural number is :" + findTotal(n));
    }
}
