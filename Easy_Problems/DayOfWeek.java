package Logic_Building.Easy_Problems;

import java.util.Scanner;

public class DayOfWeek{

    //Formula-based Approach (dayOfWeek = (d + monthCode + yearCode) % 7)- Time Complexity: O(1) Auxiliary Space: O(1)
    public static int dayOfWeek(int Day,int Month,int Year){
        // Predefined month codes for each month
        int[] monthCode = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        // Adjust year for January and February
        if(Month < 3){
            Year -= 1; //If month is January or February, treat them as a part of the previous year.
        }

        // Calculate the year code
        int yearCode = (Year % 100) + (Year % 100) / 4;

        // Adjust year code for the century
        yearCode = (yearCode + (Year / 100)/4 + 5 * (Year / 100)) % 7;

        // Calculate the day of the week and return the value as an integer
        return (Day + monthCode[Month - 1] + yearCode) % 7;

    }

    //Zeller's Congruence-Based Approach - Time Complexity: O(1) Auxiliary Space: O(1)
    static int dayofweek(int Day, int Month, int Year)
    {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; //month code
        if (Month < 3)
            Year--;
        return (Year + Year / 4 - Year / 100 + Year / 400 + t[Month - 1]
                + Day)
                % 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Day = ");
        int Day = input.nextInt();
        System.out.print("Month = ");
        int Month = input.nextInt();
        System.out.print("Year = ");
        int Year = input.nextInt();

        // Output the result as an integer (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println(dayofweek(Day,Month,Year));
    }
}