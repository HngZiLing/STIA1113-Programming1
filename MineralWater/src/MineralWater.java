import java.util.Scanner;

public class MineralWater
{
    public static void main (String[] args)
    {
        // Declare variable based on the question
        double price1 = 12, price2 = 8, price3 = 1;
        int bottlesPerSet1 = 24, bottlesPerSet2 = 10, bottlesPerSet3 = 1;

        // Declare variable for first question
        double amount;
        int set1, set2, set3;
        int totalBottles1, totalBottles2, totalBottles3;
        double totalPrice1, totalPrice2, totalPrice3;

        // Declare variable for second question
        int quantity;
        int setA, setB, setC;
        int totalBottlesA, totalBottlesB, totalBottlesC;
        double totalCostA, totalCostB, totalCostC;


        // Read amount from the user and print it
        // amount is how much does the user wants to spend to buy mineral water

        Scanner money = new Scanner (System.in);
        System.out.print("Money (RM): ");
        amount = money.nextDouble();

        System.out.println("--------------------------------------");

        /*
        How many sets user can buy, how many bottles user can get and how much user will spend in total
        If user haven't bought any set else, just use the amount
        If user have bought another set before, use the balance to calculate
         */

        // RM12 for 24 bottles
        set1 = (int) (amount / price1);
        totalBottles1 = set1 * bottlesPerSet1;
        totalPrice1 = set1 * price1;

        if (amount >= price1)
            System.out.printf("%d set (%d bottles) x %.0f -> RM%.2f \n", set1, totalBottles1, price1, totalPrice1);


        // RM8 for 10 bottles
        set2 = (int) ((amount - totalPrice1) / price2);
        totalBottles2 = set2 * bottlesPerSet2;
        totalPrice2 = set2 * price2;

        if ((amount % price1) >= price2)
            System.out.printf("%d set (%d bottles) x %.0f -> RM%.2f \n", set2, totalBottles2, price2, totalPrice2);


        // RM1 per bottle for less than 10 bottles
        set3 = (int) ((amount - (totalPrice1 + totalPrice2)) / price3);
        totalBottles3 = set3 * bottlesPerSet3;
        totalPrice3 = set3 * price3;

        if ((amount % price1) % price2 >= price3)
            System.out.printf("%d bottles x RM%.2f -> RM%.2f \n", totalBottles3, price3, totalPrice3);


        // The total price of the most mineral water that can be purchased within the specified amount, and balance
        System.out.printf("Total: RM%.2f \n", totalPrice1 + totalPrice2 + totalPrice3);
        System.out.printf("Balance: RM%.2f \n", amount - (totalPrice1 + totalPrice2 + totalPrice3));

        System.out.println("--------------------------------------");

        System.out.println(" ");

        // Read quantity from the user and print it
        // Quantity is the number of mineral water does the user want to buy

        Scanner scan = new Scanner (System.in);
        System.out.print("Quantity (bottles): ");
        quantity = scan.nextInt();

        System.out.println("--------------------------------------");

        /*
        How many sets user can buy, how many bottles user can get, and how much user will spend in total
        If user haven't bought any set else, just use the quantity
        If user have bought another set before, use the remainder to calculate
         */

        // 24 bottles for RM12
        setA = quantity / bottlesPerSet1;
        totalBottlesA = setA * bottlesPerSet1;
        totalCostA = setA * price1;

        if (quantity >= bottlesPerSet1)
            System.out.printf("%d set (%d bottles) -> RM%.2f \n", setA, totalBottlesA, totalCostA);


        // 10 bottles for RM8
        setB = (quantity - totalBottlesA) / bottlesPerSet2;
        totalBottlesB = setB * bottlesPerSet2;
        totalCostB = setB * price2;

        if ((quantity % bottlesPerSet1) >= bottlesPerSet2)
            System.out.printf("%d bottles -> RM%.2f \n", totalBottlesB, totalCostB);


        // Less than 10 bottles for RM1 per bottle
        setC = (quantity - totalBottlesA - totalBottlesB) / bottlesPerSet3;
        totalBottlesC = setC * bottlesPerSet3;
        totalCostC = setC * price3;

        if ((quantity % bottlesPerSet1) % bottlesPerSet2 >= bottlesPerSet3)
            System.out.printf("%d bottles -> RM%.2f \n", totalBottlesC, totalCostC);


        // The lowest price required to buy the quantity of mineral water user want
        System.out.printf("Total: RM%.2f \n", totalCostA + totalCostB + totalCostC);

        System.out.println("--------------------------------------");
    }
}