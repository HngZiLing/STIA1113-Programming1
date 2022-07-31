
import java.util.Scanner;

public class TriangleDemo
{
    public static void main(String[] args)
    {
        //create a Scanner object

        Scanner scan = new Scanner(System.in);

        // Create a Triangle object.

        Triangle triangle = new Triangle();

        // Prompt user to input value for height and base
        System.out.print("Enter the height  : ");
        double height = scan.nextDouble();

        System.out.print("Enter the base    : ");
        double base = scan.nextDouble();

        //Set the height and base (use mutator)

        triangle.setHeight(height);
        triangle.setBase(base);

        // Display the height, base and area (use accessor)

        System.out.println("The pyramid's height is " + 	triangle.getHeight());

        System.out.println("The pyramid's base is " + 	triangle.getBase());

        System.out.println("The pyramid's area is " + 	triangle.getArea());
    }
}