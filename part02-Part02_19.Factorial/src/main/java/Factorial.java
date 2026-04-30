
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, sum = 1;
        System.out.printf("Give a number: ");
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        System.out.println("Factorial: " + sum);
    }
}
