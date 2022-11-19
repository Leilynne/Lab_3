import java.util.Scanner;

public class ThirdCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        int fib1 = 1;
        int fib2 = 1;
        int fib3;
        System.out.print(fib1 + " " + fib2 + " ");

        if (number > 0) {
            for (int i = 3; i <= number; i++) {
                fib3 = fib1 + fib2;
                System.out.print(fib3 + " ");
                fib1 = fib2;
                fib2 = fib3;
            }
        } else {
            System.out.println(0);
        }
    }
}