import java.util.Scanner;

/**
 * Task 10
 * Define entrance of a nine-storey apartment building according
 * to the specified apartment number N. There are M apartments on
 * each floor. Output the number of the entrance to the console.
 */
public class FindingAnEntrance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter apartment number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of apartments per floor");
        int m = sc.nextInt();
        int e = m * 9;
        int f = (n - 1) / e;
        System.out.println("Apartment #" + n + " located in the entrance #" + ++f);
    }
}