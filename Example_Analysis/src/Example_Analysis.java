public class Example_Analysis
{

    public static void main(String [] args)
    {
        int n = 3;
        for (int i=1; i<=n; i++)
        {
            System.out.println("i = "+i);
        }

        System.out.println("\nAlgorithm B");

        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i;j++ )
            {
                System.out.print("i = "+i);
                System.out.println("\t j = "+j);
            }
            System.out.println();
        }

        System.out.println("\nAlgorithm XXXXX");

        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n;j++ )
            {
                System.out.print("i = "+i);
                System.out.println("\t j = "+j);
            }
            System.out.println();
        }

        System.out.println("Total - Algo A");
        int n1 = 3;
        int sumA=0;
        for (int i=1; i<=n1; i++)
        {
            sumA = sumA + i;
        }
        System.out.println("sumA = "+sumA);
        System.out.println();


        System.out.println("\nTotal - Algo B");

        int sumB=0;
        for (int i=1; i<=n1; i++)
        {
            for (int j=1; j<=i;j++ )
            {
                sumB = sumB + 1;
            }
        }
        System.out.println("sumB = "+sumB);

        int sumC = n1 * (n1 + 1) / 2;
        System.out.println("sumC = "+sumC);
    }
}