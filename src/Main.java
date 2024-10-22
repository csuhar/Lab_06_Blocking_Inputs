import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double C;
        double F;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter yout temp. in Celsius: ");
            if (in.hasNextDouble()) {
                C = in.nextDouble();

            validInput = true;
            F = (C * 9 / 5) + 32;
            System.out.println("Here is your temp. in farhenheit: " + F );
        } else {
                System.out.println("Invalid input! PLease enter a valid number: ");
                in.next();
            }
            }
    System.out.println("Point of freezing for water is: 0 Celsius " + ( 0 * 9/5 + 32) + "F");
        System.out.println("Point of boiling for water is: 100 Celsius " + ( 100 * 9/5 + 32) + "F");
    }
}