
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        
        while(!words.isEmpty()){
            String [] word = words.split(" ");
            System.out.println(word[0]);
            words = scanner.nextLine();
        }

    }
}
