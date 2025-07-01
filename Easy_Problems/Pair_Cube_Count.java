package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class Pair_Cube_Count{

    //[Naive Approach] Using Nested Loops - O(n^2) time and O(1) space
    public static int countPairs(int n){

      int count = 0;
      for(int a = 1; a <= n; a++)
          for(int b = 1; b <= n; b++)
              if(a * a * a + b * b * b == n ){
                  count++;
              }
      return count;
    }

    //[Expected Approach] Finding different pairs - O(n1/3) time and O(1) space
    public static int Countpairs(int n){

        int count = 0;

        // Check for each number 1 to cbrt(n)
        for(int i = 1; i <= Math.cbrt(n); i++) {

            // Store cube of a number
            int cb = i * i * i;

            // Subtract the cube from given n
            int diff = n - cb;

            // Check if the difference is also
            // a perfect cube
            int cbrtDiff = (int)Math.cbrt(diff);

            // If yes, then increment count
            if(cbrtDiff * cbrtDiff * cbrtDiff == diff)
                count++;
        }
     return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.println(Countpairs(n));
    }
}