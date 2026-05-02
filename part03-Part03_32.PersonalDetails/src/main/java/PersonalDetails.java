
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String longest = "";
        int avg = 0, jinx = 0;
        while(!input.isEmpty()){
                String[] lines = input.split(",");
                for(int i = 0; i < lines.length; i+=2){
                    if(longest.toCharArray().length < lines[i].length()){
                        longest = lines[i];
                    }
                }
                
                for(int j = 1; j<lines.length; j+=2){
                    avg += Integer.parseInt(lines[j]);
                    jinx++;
                }
            input = scanner.nextLine();
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0*avg/jinx));

    }
}
