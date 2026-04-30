
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 0, sum = 0;
        System.out.printf("First number? ");
        n1 = scanner.nextInt();
        System.out.printf("Last number? ");
        n2 = scanner.nextInt();
        for(int i = n1; i <= n2; i++){
            sum += i;
        }
        System.out.printf("The sum is %d", sum);
    }
}
