import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width;
        double height;

        do {

            System.out.println("Enter the width of your rectangle: ");
            width = (in.nextDouble());

            if (width <= 0)
            System.out.println("Your statement is invalid, it makes no sense!");

        } while ((width <=0));

        do {

            System.out.println("Enter the height of your rectangle: ");
            height = (in.nextDouble());

            if (height <= 0)
                System.out.println("Your statement is invalid, try again!");

        } while ((height <=0));


        double area = height * width;
        double perimeter = 2 * (height * width);
        double diagonal = ((width * width)+ (height * height));

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of your rectangle is: " + diagonal);



    }
}