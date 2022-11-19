import java.util.Scanner;

public class SeventhCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

            int n = scanner.nextInt();
            char[] array = new char[n];
            char ch = 'a';
            for (int i = 0; i < n; i++){
                array[i] = ch;
                ch += 2;
            }
        for (char a : array) {
            System.out.print(a);
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i --){
            System.out.print(array[i]);
        }
    }
}
