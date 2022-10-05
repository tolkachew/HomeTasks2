import java.util.Scanner;

/**
 * Task 12
 * The program requests a six-digit number and determines after
 * the input whether the ticket with such number will be winning
 * (the sum of the first three digits matches the sum of the last three
 * digits).
 */
public class WinningTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ticket number: ");
        int a = sc.nextInt();
        int b = a / 1000;
        int c = b / 100 + (b / 10) % 10 + b % 10;
        int d = a / 100 % 10 + (a / 10 % 10) + a % 10;
        if (c == d) {
            System.out.println("Winning ticket!");
        } else {
            System.out.println("No win ticket.");
        }
    }
}


