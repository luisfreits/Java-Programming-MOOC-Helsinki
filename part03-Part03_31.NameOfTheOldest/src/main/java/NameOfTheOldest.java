
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int old = 0;
        String name = "";
        while(!input.isEmpty()){          
            String parts[] = input.split(",");
                for(int i = 1; i < parts.length; i+=2){
                    if(old<Integer.parseInt(parts[i])){
                        old = Integer.parseInt(parts[i]);
                        name = parts[i-1];
                    }
            }
            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + name);
    
    }
}
