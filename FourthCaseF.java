import java.util.Scanner;

public class FourthCaseF{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();;
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        for(int i = Math.min(firstNumber, secondNumber); i <= Math.max(firstNumber, secondNumber); i++){
            System.out.print(i + " ");
        }
    }
}
