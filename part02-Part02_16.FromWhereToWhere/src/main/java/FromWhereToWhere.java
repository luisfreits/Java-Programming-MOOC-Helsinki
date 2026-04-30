
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Where to? ");
        int n = scanner.nextInt();
        System.out.printf("Where from? ");
        int z = scanner.nextInt();
        if(n >= z){
            for(int diff = n - z; diff >= 0; diff--){
                System.out.println(n-diff);
            }
        }
    }
}
