
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for(int n = 0; n < array.length; n ++){
            System.out.print(array[n]);
            if (n!=array.length-1) {
                System.out.print(", ");
            }
        }
    }
}
