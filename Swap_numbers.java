package Logic_Building;

import java.util.Scanner;

public class Swap_numbers{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a = ");
        int a = input.nextInt();
        System.out.print("Enter number b = ");
        int b = input.nextInt();

        System.out.print("Before Swapping a = "+ a + "b = " + b );

         //[Naive Approach] Using Third Variable
        // Swap a and b using temp variable
        //Time Complexity: O(1)
        //Auxiliary Space: O(1)
        int temp = a;
        a = b;
        b = temp;

        //[Expected Approach] Without using Third Variable
        //Time Complexity: O(1)
        //Auxiliary Space: O(1)
        //Using Arithmetic operators
       /* a = a + b;
        b = a - b;
        a = a - b;*/

        //Using Bitwise XOR
       /* a = a ^ b;
        b = a ^ b;
        a = a ^ b;*/

        System.out.print("After Swapping a = "+ a + "b = " + b );
    }

}