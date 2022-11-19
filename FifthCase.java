import java.util.Scanner;

public class FifthCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numberSum = scanner.nextInt();

        int count = 1;
        int num = 0;
        int sum = 0;

        while (count <= numberSum){
            num++;
            if(num % 5 == 2 || num % 3 == 1){
                sum += num;
                count++;
                System.out.print(num + " ");
            }
        }
        System.out.println(sum);
    }
}
