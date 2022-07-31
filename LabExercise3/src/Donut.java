public class Donut
{
    // 当variable是private时，如果想在别的class用，那就要把它放在public method然后才在别的class call它

    private String type;
    private String topping;
    private String size;
    private double price;

    public Donut(String t, String tP, String s, double p)
    {
        type = t;       // temporary
        topping = tP;   // 在testDonut用到的时候，会暂时放在这
        size = s;
        price = p;
    }

    public Donut(String type, String topping, String size)
    {
        this.type = type;
        this.topping = topping;
        this.size = size;
    }

    // get method
    public String getType()
    {
        return type;
    }

    public String getTopping()
    {
        return topping;
    }

    public String getSize()
    {
        return size;
    }

    // set method
    // 已经create过了，想change
    public void setType(String ty)
    {
        type = ty;
    }
    public void setTopping(String p)
    {
        topping = p;
    }

    public void setSize(String sz)
    {
        size = sz;
    }

    public void setPrice(double p)
    {
        price = p;
    }

    public double setPriceTax()
    {
        double taxPrice = (price * 0.03) + price;
        return taxPrice;
    }

    public void printDonutInfo()
    {
        System.out.println("Donut type: " + type);
        System.out.println("Donut topping: " + topping);
        System.out.println("Donut size: " + size);
        System.out.printf("Donut price: RM%.2f \n", price);
        System.out.printf("Total Price: RM%.2f \n", setPriceTax());
    }
}
