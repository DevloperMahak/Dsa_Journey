package Logic_Building.Easy_Problems;

import java.util.Scanner;

//LCM of two numbers is the smallest number which can be divided by both numbers.
public class LCM {

    //[Naive Approach] Using Conditional Loop - Time Complexity: O(min(a,b))
    //Auxiliary Space: O(1)
    static int LCM(int a, int b){

        // Larger value
        int g = Math.max(a,b);

        // Smaller value
        int s = Math.min(a,b);

        for(int i = g; i <= a * b; i += g ) {
            if (i % s == 0)
                return i;
        }
        return a * b;
    }

    //[Expected Approach] Using GCD LCM Formula - Time Complexity: O(log(min(a,b))
    //Auxiliary Space: O(log(min(a,b))
    static int gcd(int a, int b){
        return (b == 0) ? a : gcd(b,a % b);
    }

    static int lcm(int a, int b){
        return (a/gcd(a,b)) * b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.println(lcm(a,b));
    }
}