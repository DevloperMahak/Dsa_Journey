package Logic_Building.Easy_Problems;

import java.util.Scanner;

//The GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them.
public class GCD_HCF{

    //[Approach - 1] Using Loop - O(min(a, b)) Time and O(1) Space
    public static int gcd(int a, int b){

        // Find Minimum of a and b
        int result = Math.min(a, b);
        while(result > 0){
            if(a % result == 0 && b % result == 0){
                break;
            }
            result--;
        }
        // Return gcd of a and b
        return result;
    }

    //[Approach - 2] Euclidean Algorithm using Subtraction - O(min(a,b)) Time and O(min(a,b)) Space
    public static int Gcd(int a, int b){

        // Everything divides 0
        if(a == 0)
            return b;
        if(b == 0)
            return a;

        // Base case
        if(a == b)
            return a;

        // a is greater
        if(a > b)
            return gcd(a-b, b);
        return gcd(a,b-a);
    }

    //[Approach - 3 ] Modified Euclidean Algorithm using Subtraction by Checking Divisibility - O(min(a, b)) Time and O(min(a, b)) Space
    public static int GCD(int a, int b){

        // Everything divides 0
        if(a == 0)
            return b;
        if(b == 0)
            return a;

        // Base case
        if(a == b)
            return a;

        // a is greater
        if(a > b){
            if(a % b == 0)
                return b;
            return GCD(a-b, b);
        }

        // b is greater
        if(b % a == 0)
            return a;
            return GCD(b,b-a);

    }

    //[Approach - 4] Optimized Euclidean Algorithm by Checking Remainder - O(log(min(a,b))) Time and O(log(min(a,b)) Space
    //[Approach - 5] Using Built-in Function - O(log(min(a, b))) Time and O(1) Space
    static int hcf(int a, int b) {
        return (b == 0) ? a : hcf(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.println(hcf(a,b));
    }
}