
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int old = 0;
        while(!input.isEmpty()){          
            String parts[] = input.split(",");
                for(int i = 1; i < parts.length; i+=2){
                    if(old<Integer.parseInt(parts[i])) old = Integer.parseInt(parts[i]);
            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + old);
    }
}
