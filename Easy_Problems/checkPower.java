package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class checkPower{

    //[Naive Approach] Repeated Multiplication Method - Time complexity: O(Logxy)
    //Auxiliary space: O(1)
    public static boolean isPower(int x, long y){

        // The only power of 1 is 1 itself
        if(x == 1)
            return (y == 1);

        // Repeatedly compute power of x
        long pow =1;
        while(pow < y)
            pow *= x;

            // Check if power of x becomes y
            return (pow == y);
    }

    //[Better Approach] Exponentiation and Binary Search Method - Time Complexity - O(log log y)
    //Auxiliary Space - O(1)
    public static boolean Is_Power(int x, long y){

        // The only power of 1 is 1 itself
        if(x == 1)
            return (y == 1);
        if(y == 1)
            return true;

        // Repeatedly compute power of x
        long pow =x;
        while(pow < y) {
            pow *= pow;
        }
        // Check if power of x becomes y
        if(pow == y)
            return true;

        long low = x, high = pow;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long result = (long) Math.pow(x, (int)(Math.log(mid)/Math.log(x)));
            if(result == y)return true;
            if(result < y)low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    //[Expected Approach] Logarithmic Method - Time complexity: O(1)
    //Auxiliary space: O(1)
    public static boolean Power(int x, long y){
        //logx(y)=log(y)/log(x)
        // x ^ res1 = y
        double res1 = Math.log(y)/Math.log(x);
        return res1 == Math.floor(res1);
    }
    public static void main(String[] args) {
        System.out.print("x = ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("y = ");
        int y = input.nextInt();
        System.out.println("Is y a power of x ? \n" + Power(x,y));
    }
}