import java.util.Scanner;

public class Main2 {
    public static void Main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gasInTank;
        double fuelEfficiencyMPG;
        double pricePG;

        do {
            System.out.println("enter the amount of gas currently in your tank (make sure your answer makes sense) : ");
            gasInTank = in.nextDouble();
        } while (in.nextDouble() <= 0);

        do {
            System.out.println("enter the MPG on your vehicle (make sure your answer makes sense): ");
             fuelEfficiencyMPG = in.nextDouble();
        } while (in.nextDouble() <= 0);

        do {
            System.out.println("enter the price per gallon (make sure your answer makes sense): ");
             pricePG = in.nextDouble();
        } while (in.nextDouble() <= 0);

        double costPer100M = (100 / fuelEfficiencyMPG) * pricePG;
        double fulltankDistance = gasInTank * fuelEfficiencyMPG;

        System.out.println("The cost of gas per 100 miles is: " + costPer100M);
        System.out.println("The distance you can drive with a full tank is: " + fulltankDistance);




    }
}