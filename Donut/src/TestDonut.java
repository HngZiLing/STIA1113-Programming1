public class TestDonut
{
    public static void main(String[] args)
    {
//        Donut donut1 = new Donut();
//        donut1.printDonutInfo();
//        System.out.println("\n--- First Donut Object ---");

        Donut donut2 = new Donut("Mini", "Almond", "Small", 3);
        donut2.printDonutInfo();

        System.out.println("-----------------------");

        Donut donut3 = new Donut("Swirl", "Mocha", "Large");
        donut3.setPrice(3.5);
        donut3.printDonutInfo();

//        double priceTax = (donut3.getPrice() * 0.03) + donut3.getPrice();
//        System.out.printf("Total Price (3%%)    : RM %.2f \n", priceTax);

    }
}






