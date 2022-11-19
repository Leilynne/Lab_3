import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SixthCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        try {
            int n = scanner.nextInt();
            int[] array = new int[n];
            int num = 2;
            for (int i = 0; i < n; i++){
                array[i] = num;
                num += 5;
            }
            System.out.println(Arrays.toString(array));
        } catch (InputMismatchException | NegativeArraySizeException e){
            System.out.println("You can input only positive numbers");
        }
    }
}
