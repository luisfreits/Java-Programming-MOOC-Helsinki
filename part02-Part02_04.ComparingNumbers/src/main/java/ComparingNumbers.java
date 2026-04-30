
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (x > y) {
            System.out.printf("%d is greater than %d.", x, y);
        } else if (x < y) {
            System.out.printf("%d is smaller than %d.", x, y);
        } else {
            System.out.printf("%d is equal to %d.", x, y);
        }
    }
}
