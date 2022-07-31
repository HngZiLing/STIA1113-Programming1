import java.util.Scanner;

public class TestDonut2
{
    private String donutType;
    private String donutTopping

    public static void UserDonut
    {
        System.out.println("DONUTS HOUSE");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Donut Type [Mini/Ordinary/Swirl]: ");
        donutType = input.nextLine();
        System.out.println("Enter Donut Topping [Mocha/White Chocolate/Almond]: ");
        donutTopping = input.nextLine();
        System.out.println("Enter Donut Size [Small/Medium/Large]: ");
        String donutSize = input.nextLine();

        double donutPrice;

        if (donutSize == "small")
            donutPrice = 2.5;

        else if (donutSize == "medium")
            donutPrice = 3;

        else if (donutSize == "large")
            donutPrice = 3.5;

        Donut yourDonut = new Donut;

    }


}
