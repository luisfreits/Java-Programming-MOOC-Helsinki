
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        x = scanner.nextInt();
        if (x>=0){
            System.out.println(x);
        }
        if (x<0){
            System.out.println(x*-1);
        }
    }
}
