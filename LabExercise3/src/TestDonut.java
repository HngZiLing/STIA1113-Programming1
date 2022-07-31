public class TestDonut
{
    public static void main(String[] args)
    {
//      Donut donut1 = new Donut();     // no-argument constructor = no anything inside()
//      donut1.printDonutInfo();

        Donut donut2 = new Donut("ordinary", "almond", "small", 2.0);
//        System.out.println(donut2.getType());   // 只要print type
        donut2.printDonutInfo();
        System.out.println();

        Donut donut3 = new Donut("mini", "chocolate", "large");
        donut3.setPrice(3.5);
        donut3.printDonutInfo();        // 因为上面set了price，所以这里就可以变成可以有price了

//        System.out.println("\n ---change value--- \n");
//        donut3.setSize("medium");
//        donut3.setTopping("almond");
//        donut3.printDonutInfo();
    }
}
