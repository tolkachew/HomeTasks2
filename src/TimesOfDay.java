import java.util.Scanner;

/**
 * Task 2
 * The time is entered from the keyboard (the number of hours
 * from 0 to 24), and the program displays greeting corresponding
 * to the entered time (for example, if 15 is entered, the greeting
 * “good day” is displayed)
 */
public class TimesOfDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter time of day from 0-24 : ");
        int t = in.nextInt();
        if ((t >= 6) && (t <= 12)) {
            System.out.println("Good morning!");
        } else if ((t >= 13) && (t <= 16)) {
            System.out.println("Good afternoon!");
        } else if ((t >= 17) && (t <= 23)) {
            System.out.println("Good evening!");
        } else if (((t >= 23) && (t <= 25)) || ((t >= 0) && (t <= 5))) {
            System.out.println("Good night!");
        } else {
            System.out.println("Incorrect time entered!");
        }
    }
}
