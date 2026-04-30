
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0, sum = 0;
        while(true){
            System.out.println("Give a number:");
            temp = scanner.nextInt();
            if(temp<0){
                sum += 1;
            }
            if (temp==0){
                break;
            }
        }
        System.out.printf("Number of negative numbers: %d", sum);
    }
}
