package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class Factorial {

    //[Approach 1] Iterative Solution - O(n) Time and O(1) Space
    static int factorial(int n){
        int res = 1;
        for(int i = 2; i <=n; i++)
            res *= i;
        return res;
    }

    //[Approach 2] Recursive Solution - O(n) Time and O(n) Space
    /* static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));

    }
}