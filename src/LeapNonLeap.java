import java.util.Scanner;

/**
 * Task 6
 * Define the amount of days in a year entered by the user and
 * output it to the console. The leap year has 366 days, while the
 * regular one has 365. Leap years are all years divided by 4 without
 * a remainder, excluding centuries which are not divided by 400
 * without a remainder.
 */
public class LeapNonLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int a = sc.nextInt();
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            System.out.println("The year is a leap year. ");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}