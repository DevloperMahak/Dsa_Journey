package Logic_Building.Easy_Problems;

import java.util.Scanner;

//A number is a perfect number if it is equal to the sum of its proper divisors
public class Perfect_No{

    //[Naive Approach] Divisor Sum Method - O(n) Time and O(1) Space
    static  boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    //[Expected Approach] Optimized Divisor Search Method - O(sqrt n) Time and O(1) Space
    static  boolean _isPerfect(int n){
        int sum = 1;
        for(int i = 2; i * i <= n; i++){
            if (n % i == 0) {
                if(i * i != n)
                    sum = sum + i + n / i ;
                else sum = sum + i;
            }
        }
        return sum == n && n != 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.println(_isPerfect(n) ? "true" : "false");
    }
}