
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp =0, sum = 0, quant = 0;
        while(true){
            System.out.println("Give a number:");
            temp = scanner.nextDouble();
            if(temp!=0){
                sum += temp;
                quant++;
            } else {
                temp = sum / quant;
                break;
            }
        }
        System.out.printf("Average of the numbers: %f", temp);
    }
}
