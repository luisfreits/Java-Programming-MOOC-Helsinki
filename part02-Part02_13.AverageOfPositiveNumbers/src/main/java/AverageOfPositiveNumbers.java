
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = 0, sum = 0, quant = 0;
        while(true){
            temp = scanner.nextDouble();
            if(temp!=0){
                if(temp>0){
                    sum += temp;
                    quant++;
                }
            } else {
                break;
            }
        }
        if(quant>0){
            temp = sum / quant;
            System.out.println(temp);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
