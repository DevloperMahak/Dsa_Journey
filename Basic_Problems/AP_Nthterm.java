package Logic_Building.Basic_Problems;

import java.util.Scanner;

public class AP_Nthterm{

    //[Naive Approach] - Using for Loop
    //Time Complexity - O(n)
    //Auxiliary Space - O(1)
    public static int nthtermofAP(int a1,int a2, int n){
     int nthterm = a1 , d = a2 - a1;
     for(int i = 1 ; i < n ; i++){
         nthterm += d;
     }
     return nthterm;
    }
    //[Expected Approach] - Using the Formula for nth Term
    //Time Complexity - O(1)
    //Auxiliary Space - O(1)
    public static int NthtermofAP(int a1,int a2, int n){
        // using formula to find the
        // Nth term t(n) = a(1) + (n-1)*d
        return (a1 + (n - 1) * (a2 - a1));
    }

    public static void main(String[] args) {
        int a1 = 2 , a2 = 3;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Nth term of AP = " + NthtermofAP(a1,a2,n));
    }
}