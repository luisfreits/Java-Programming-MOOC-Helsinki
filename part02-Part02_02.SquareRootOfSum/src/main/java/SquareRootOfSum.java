
import java.util.Scanner;
import java.lang.Math;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double root = 0;
        sum = scanner.nextInt();
        sum += scanner.nextInt();
        root = Math.sqrt(sum);
        System.out.printf("%.0f", root);
    }
}
