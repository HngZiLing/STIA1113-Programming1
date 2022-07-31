import java.util.Scanner;
public class TestDonut2
{
    public static void main(String[] args)
    {
        String type, topping, size;
        double price;
        Scanner scan = new Scanner(System.in);

        System.out.println("DONUTS HOUSE");
        System.out.println("----------------------");

        System.out.print("Enter Donut Type [Mini/Ordinary/Swirl]            : ");
        type = scan.next();

        System.out.print("Enter Donut Topping [Mocha/White Chocolate/Almond]: ");
        topping = scan.next();

        System.out.print("Enter Donut Size [Small/Medium/Large]             : ");
        size = scan.next();

        System.out.println("----------------------");

        Donut donut1 = new Donut(type, topping, size);
        donut1.setPriceBasedSize();
        donut1.printDonutInfo();
    }
}

