import java.util.Scanner;

public class ThirdCaseW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        int fib1 = 1;
        int fib2 = 1;
        int fib3;
        int i = 1;

        System.out.print(fib1 + " ");
        while (i < number){
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            System.out.print(fib1 + " ");
            i++;
        }
    }
}