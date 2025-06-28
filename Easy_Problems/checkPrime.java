package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class checkPrime{

    // [Approach 1] School Method - Time Complexity - O(n) Space Complexity - O(1)
    static boolean isPrime(int n){

        // Corner case
        if(n <= 1)
            return false;

        // Check from 2 to n-1
        for(int i = 2; i < n; i++)
            if(n % i == 0)
                return false;
        return true;
    }

    // [Approach 2] Optimized School Method - Time Complexity - O(√n) Space Complexity - O(1)
    static boolean checkPrime(int n){

        // Corner case
        if(n <= 1)
            return false;

        // Check from 2 to n-1
        for(int i = 2; i * i<= n; i++)
            if(n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter number = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(checkPrime(n))
            System.out.print("Prime");
        else
            System.out.print("Not Prime");
    }
}