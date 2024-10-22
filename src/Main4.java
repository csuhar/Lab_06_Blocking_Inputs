import java.util.Scanner;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int randNum = rand.nextInt(10) + 1;
        int guess;

        do {
            System.out.println("Enter a random guess between 1-10 (must be between 1-10 or else... : ");
            guess = in.nextInt();


            }
            while ((guess < 1 || guess > 10)) ;

            System.out.println("The random number ended up being: " + randNum);
            if (guess > randNum) {
                System.out.println("Your number was too high!");
            } else if (guess < randNum) {
                System.out.println("Your number was too low!");
            } else {
                System.out.println("You guess right! Im very suprised good job!");
            }

        }
    }


