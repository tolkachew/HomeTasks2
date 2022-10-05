import java.util.Scanner;

/**
 * Task 4
 * There is a point with coordinates x and y on a plane, define
 * and output to the console in which quadrant of the Cartesian
 * coordinate system the point is. Quadrants are numbered with
 * Roman numerals.
 */
public class CartesianCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'x' 'y' coordinates accordingly:");
        int x = sc.nextInt(), y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Point is in I square.");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in II square.");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in III square.");
        } else if (x > 0 && y < 0) {
            System.out.println("Point is in IV square.");
        } else {
            System.out.println("The point is in none of the squares.");
        }
    }
}
