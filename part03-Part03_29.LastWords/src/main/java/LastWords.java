
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        
        while(!words.isEmpty()){
            String [] word = words.split(" ");
            System.out.println(word[word.length-1]);
            words = scanner.nextLine();
        }

    }
}
