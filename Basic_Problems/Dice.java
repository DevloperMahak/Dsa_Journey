package Logic_Building.Basic_Problems;

import java.util.Scanner;

public class Dice {

    //[Naive Approach] Using if-else Statement
    //Time Complexity: O(1)
    //Auxiliary Space: O(1)
    public static int oppositeFaceOfDice(int n){
        int ans ;
        if(n == 1){
            ans = 6;
        } else if (n == 2) {
            ans = 5;
        } else if (n == 3) {
            ans = 4;
        } else if (n == 4) {
            ans = 3;
        } else if (n == 5) {
            ans = 2;
        }else{
            ans = 1;
        }
        return ans;
    }
    //[Expected Approach] Using Sum of Two Sides
    //Time Complexity: O(1)
    //Auxiliary Space: O(1)
    public static int opposite_FaceOfDice(int n){
        // Stores number on opposite face of dice
        int ans = 7 -n;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number whom you want to find opposite face : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(oppositeFaceOfDice(n));
    }
}