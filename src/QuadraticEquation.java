import java.util.Scanner;

/**
 * Task 11
 * Find roots of a quadratic equation and output them to the
 * screen if there are any. If there are no roots, output message
 * informing about this. The quadratic equation is defined by the
 * coefficients a, b, c entered from the keyboard by the user.
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b и c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        double x = -b / (2 * a);
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        if (d > 0) {
            System.out.println("The equation has two roots = " + x1 + " , " + x2);
        } else if (d == 0) {
            System.out.println("The equation has only one root = " + x);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}