
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(scanner.nextInt());
        int temp = lista.get(0), in = 0;
        if(lista.get(0) != 9999){
            for(int i = 1; i < i + 1; i ++){
                lista.add(scanner.nextInt());
                if(lista.get(i) == 9999) break;
                int n = lista.get(i);
                if(n< temp) {
                    temp = n;
                    in = i;
                }
            }
        }
        System.out.println("Smallest number: " + temp);
        System.out.println("Found at index: " + in);

        
    }
}
