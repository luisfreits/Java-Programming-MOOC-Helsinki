
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0, sum = 0;
        while(true){
            System.out.println("Give a number:");
            temp = scanner.nextInt();
            if(temp!=0){
                sum += temp;
            } else{
                break;
            }
        }
        System.out.printf("Sum of the numbers: %d", sum);
    }
}
