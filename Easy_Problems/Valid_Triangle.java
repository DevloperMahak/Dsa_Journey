package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class Valid_Triangle{

    //Check whether triangle is valid or not if sides are given - Time Complexity: O(1)
    //Auxiliary Space: O(1)
    public static int checkValidity(int a, int b, int c){
     if(a + b <= c || a + c <= b || b + c <= a)
         return 0;
     else
         return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.print("c = ");
        int c = input.nextInt();
        if(checkValidity(a, b, c) == 1)
            System.out.print("Valid Triangle");
           else
            System.out.print("Invalid Triangle");
    }
}