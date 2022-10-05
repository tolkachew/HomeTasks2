import java.util.Scanner;

/**
 * Task 9
 * Coordinates of the beginning of a segment and of the end of
 * a segment are given. If we consider the segment as a hill, then
 * in one case it is descent, and in another it is ascent. Define and
 * output to the screen whether it is descent or ascent, whether the
 * road is smooth or upright.
 */
public class FindAscentDescent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start (x1,y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter finish (x2,y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if ((x1 < x2) && (y1 < y2)) {
            System.out.println("Ascent!");
        } else if ((x1 == x2) || (y1 == y2)) {
            System.out.println("Smooth!");
        } else if ((x1 > x2) || (y1 > y2)) {
            System.out.println("Descent!");
        }
    }
}
