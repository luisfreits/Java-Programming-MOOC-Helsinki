
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, sum = 0;
        System.out.printf("Last number? ");
        n = scanner.nextInt();
        for(int i = 0; i<= n; i++){
            sum += i;
        }
        System.out.printf("The sum is %d", sum);
    }
}
