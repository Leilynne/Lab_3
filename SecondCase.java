import java.util.Scanner;

public class SecondCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the day");
        String nameOfDay = scanner.nextLine();
        switch (nameOfDay) {
            case ("Monday") -> System.out.println(nameOfDay + " first day of the week.");
            case ("Tuesday") -> System.out.println(nameOfDay + " second day of the week.");
            case ("Wednesday") -> System.out.println(nameOfDay + " third day of the week.");
            case ("Thursday") -> System.out.println(nameOfDay + " fourth day of the week.");
            case ("Friday") -> System.out.println(nameOfDay + " fifth day of the week.");
            case ("Saturday") -> System.out.println(nameOfDay + " sixth day of the week.");
            case ("Sunday") -> System.out.println(nameOfDay + " seventh day of the week.");
            default -> System.out.println("Your name of the day is incorrect");
        }
    }
}