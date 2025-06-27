package Logic_Building;

import java.util.Scanner;

public class Table{

    // Approach 1 - Iterative Approach
    //Time Complexity - O(1)
    //Space Complexity - O(1)
    public static void printTable(int n){
     for(int i = 1; i<=10; i++){
         System.out.println(n + " * " + i + " = " + n * i);
     }
    }
    // Approach 2 - Recursive Approach
    //Time Complexity - O(1)
    //Space Complexity - O(1)
    static void countTable(int n , Integer... val){
        int i = 1;
        if(val.length != 0)
            i = val[0];
            if(i == 11) // base case
                return;
                System.out.println(n + " * " + i + " = " + n * i);
                i++;
                countTable(n, i);

    }

    public static void main(String[] args) {
        System.out.print("Table of : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printTable(n);
    }
}