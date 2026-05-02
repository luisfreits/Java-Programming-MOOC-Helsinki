
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while(!text.isEmpty()){
            String[] parts = text.split(" ");
            for(String part : parts){
                if(part.contains("av")){
                System.out.println(part);
                }
            }
            text = scanner.nextLine();
        }
    }
}
