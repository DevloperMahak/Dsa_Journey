package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class Distance{

    //Program to calculate distance between two points
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = input.nextInt();
        System.out.print("x2 = ");
        int x2 = input.nextInt();
        System.out.print("y1 = ");
        int y1 = input.nextInt();
        System.out.print("y2 = ");
        int y2 = input.nextInt();
        //Rounds the result to 5 decimal places using
        System.out.println(Math.round(distance(x1,y1, x2,y2) * 100000.0 )/ 100000.0);
    }
}