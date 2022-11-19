import java.util.Scanner;

public class SecondCaseVersionIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the day");
        String nameOfDay = scanner.nextLine();

        if (nameOfDay.equals("Monday")){
            System.out.println(nameOfDay + " first day of the week.");
        } else if(nameOfDay.equals("Tuesday")){
            System.out.println(nameOfDay + " second day of the week.");
        }
        else if(nameOfDay.equals("Wednesday")){
            System.out.println(nameOfDay + "  third day of the week.");
        }
        else if(nameOfDay.equals("Thursday")){
            System.out.println(nameOfDay + " fourth day of the week.");
        }
        else if(nameOfDay.equals("Friday")){
            System.out.println(nameOfDay + " fifth day of the week.");
        }
        else if(nameOfDay.equals("Saturday")){
            System.out.println(nameOfDay + " sixth day of the week.");
        }
        else if(nameOfDay.equals("Sunday")){
            System.out.println(nameOfDay + " seventh day of the week.");
        } else {
            System.out.println("Your name of the day is incorrect");
        }
    }
}