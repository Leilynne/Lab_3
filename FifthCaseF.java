import java.util.Scanner;

public class FifthCaseF{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int sum = 0;
        int counterThree = 1;
        int counterFive = 2;
        for (; number > 0; number--) {
            if (counterThree == counterFive) {
                counterThree += 3;
            }
            if (counterThree < counterFive) {
                System.out.print(counterThree + " ");
                sum += counterThree;
                counterThree += 3;
            } else {
                System.out.print(counterFive + " ");
                sum += counterFive;
                counterFive += 5;
            }
        }
        System.out.print(sum);
    }
}