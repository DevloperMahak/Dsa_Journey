package Logic_Building.Basic_Problems;

import java.util.Scanner;

public class Closest_No{

    //[Naive Approach] Iterative Checking - O(m) Time and O(1) Space
    static int ClosestNo(int n, int m){
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;
        for(int i = n - Math.abs(m); i <= n + Math.abs(m); ++i){
            if(i % m ==0){
                int difference = Math.abs(n - i);
                if (difference < minDifference || (difference == minDifference && Math.abs(i) > Math.abs(closest))){
                    closest = i;
                    minDifference = difference;
                }
            }
        }
        return closest;
    }
    //[Expected Approach] By finding Quotient - O(1) Time and O(1) Space
    static int ClosestNumber(int n, int m){
        int q = n/m;
        // 1st possible closest number
        int n1 = m * q;
        // 2nd possible closest number
        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
        // if true, then n1 is the required closest number
        if (Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
        else
            // else n2 is the required closest number
            return n2;

    }
    public static void main(String[] args) {
        int n = 13;
        int m = 4;
        System.out.println(ClosestNumber(n,m));
    }
}