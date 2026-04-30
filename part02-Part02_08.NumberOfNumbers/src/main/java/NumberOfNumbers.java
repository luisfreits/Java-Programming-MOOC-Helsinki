
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0, sum = 0;
        while(true){
            System.out.println("Give a number:");
            temp = scanner.nextInt();
            if (temp!=0){
                sum += 1;
            } else {
                break;
            }
        }
        System.out.printf("Number of numbers: %d", sum);
    }
}
