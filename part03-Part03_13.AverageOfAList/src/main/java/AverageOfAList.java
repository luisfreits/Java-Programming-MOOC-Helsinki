
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while(true){
            int n = scanner.nextInt();
            if(n==-1) break;
            list.add(n);
            sum += n;
        }
        System.out.println("Average: " + (1.0*sum/(list.size())));
    }
}
