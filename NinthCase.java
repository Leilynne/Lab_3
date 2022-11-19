import java.util.Random;

public class NinthCase {
    public static void main(String[] args){
        int[] arr = new int[10];
        int min = 0x7fffffff;
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            arr[i] = random.nextInt();
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print(min + " ");
        for (int i = 0; i < 10; i++ ){
            if (arr[i] == min){
                System.out.print(i + " ");
            }
        }
    }
}
