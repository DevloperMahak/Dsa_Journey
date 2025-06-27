package Logic_Building;

import java.util.Scanner;

class Naturalno_Squaresum{

    //[Naive Approach] Using Loop - O(n) Time and O(1) Space
    public static int summation(int n){
    int sum = 0;
    // iterating over all the numbers
    // between 1 to n
    for (int i = 1 ; i<=n; i++)
        sum += i*i;
    return sum;
    }

    public static int addition(int n){
        //[Expected Approach] Formula Based Method- O(1) Time and O(1) Space
        // Using mathematical formula to compute
        // sum of first n natural numbers
        return (n * (n + 1) * (2 * n + 1)) / 6;
    } 

    public static void main(String[] args) {
        System.out.println("Enter the natural number till which you have to find the sum of square of natural number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Sum of square"+ n + " natural number is :" + addition(n));
    }
}