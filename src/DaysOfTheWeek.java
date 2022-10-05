import java.util.Scanner;

/**
 * Task 1
 * Write a program that prompts the user to enter the number of
 * the day of the week from the keyboard and displays the name of
 * that day in response (for example, 6 stands for Saturday). Solve
 * using switch.
*/
public class DaysOfTheWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day of the week entered!");
        }
    }
}