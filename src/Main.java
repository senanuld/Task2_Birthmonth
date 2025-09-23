import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth month (1-2): ");
        int month = input.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("valid month");
        }else {
                System.out.println("your birth month is: " + month);
        }
    }
}