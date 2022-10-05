import java.util.Scanner;

/**
 * Task 8
 * Numbers x and y are given. The program must output to the
 * console “YES” if both numbers are even or odd, otherwise the
 * program outputs nothing
*/
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'x': ");
        int x = sc.nextInt();
        System.out.println("Enter 'y': ");
        int y = sc.nextInt();
        if (Math.abs(x % 2) == 0 && Math.abs(y % 2) == 0) {
            System.out.println("YES");
        } else if (Math.abs(x % 2) != 0 && Math.abs(y % 2) != 0) {
            System.out.println("YES");
        } else {
            System.exit(0);
        }
    }
}