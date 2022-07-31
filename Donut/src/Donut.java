public class Donut
{
    private String type;
    private String topping;
    private String size;
    private double price;


    public Donut(String t, String tp, String s, double p)
    {
        type = t;
        topping = tp;
        size = s;
        price = p;
    }

    public Donut(String type, String topping, String size)
    {
        this.type = type;
        this.topping = topping;
        this.size = size;
    }

    public void setPrice(double p)
    {
        price = p;
    }

//    public double getPrice()
//    {
//        return price;
//    }

    public void printDonutInfo()
    {
        System.out.println("Donut type          : " + type);
        System.out.println("Donut topping       : " + topping);
        System.out.println("Donut size          : " + size);
        System.out.printf("Donut price         : RM %.2f \n", price);
        System.out.printf("Price with GST      : RM %.2f \n", calculatePriceTax());
    }

    public double calculatePriceTax()
    {
        return (price * 0.03) + price;
    }

    public void setPriceBasedSize()
    {
        if (size.equalsIgnoreCase("Small"))
            price = 2.5;

        else if (size.equalsIgnoreCase("Medium"))
            price = 3;

        else if (size.equalsIgnoreCase("Large"))
            price = 3.5;
    }
}








