import java.util.Scanner;
public class AreaTriangle
{
    public static void main(String[] args)
    {
        int width, height, area;
        Scanner scan = new Scanner (System.in);

        do {
            System.out.print("Please enter the width: ");
            width = scan.nextInt();

            if(width < 2 || width > 10)
                System.out.println("This is invalid number! The width cannot less than 2 or more than 10! Please enter again!\n");

        } while (width < 2 || width > 10);

        do {
            System.out.print("Please enter the height: ");
            height = scan.nextInt();

            if (height < 2 || height > 10)
                System.out.println("This is invalid number! The height cannot less than 2 or more than 10! Please enter again!\n");

        } while (height < 2 || height > 10);

        area = (width * height) / 2;
        System.out.println("The area of triangle: " + area );
    }
}
