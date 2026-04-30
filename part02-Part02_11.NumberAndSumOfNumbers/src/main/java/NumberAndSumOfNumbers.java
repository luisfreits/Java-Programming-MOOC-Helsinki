
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0, sum = 0, quant = 0;
        while(true){
            System.out.println("Give a number:");
            temp = scanner.nextInt();
            if(temp!=0){
                sum += temp;
                quant++;
            } else {
                break;
            }
        }
        System.out.printf("Number of numbers: %d\n", quant);
        System.out.printf("Sum of the numbers: %d", sum);
    }
}
