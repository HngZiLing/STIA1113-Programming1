import java.util.Scanner;

public class Golf
{
    static int[] Golfer_score_A = new int[18];
    static int[] Golfer_score_B = new int[18];
    static int[] Golfer_score_C = new int[18];
    static int[] Golfer_score_D = new int[18];
    static int[] Golfer_score_E = new int[18];
    static int[] Golfer_score_F = new int[18];
    static int Netscore1;
    static int Netscore2;
    static int Netscore3;
    static int Netscore4;
    static int Netscore5;
    static int Netscore6;
    static String Golfer_ID_A;
    static String Golfer_ID_B;
    static String Golfer_ID_C;
    static String Golfer_ID_D;
    static String Golfer_ID_E;
    static String Golfer_ID_F;
    static int handicap_number_A;
    static int handicap_number_B;
    static int handicap_number_C;
    static int handicap_number_D;
    static int handicap_number_E;
    static int handicap_number_F;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("1) Player A\n2) Player B\n3) Player C\n4) Player D\n5) Player E\n6) Player F\n7) View Scorecard");
            System.out.print("\nPlease select number 1 - 7 \nSelection: ");
            String selection = in.next();

            switch (selection)
            {
                case "1":
                    calculateScorePlayerA();
                    break;
                case "2":
                    calculateScorePlayerB();
                    break;
                case "3":
                    calculateScorePlayerC();
                    break;
                case "4":
                    calculateScorePlayerD();
                    break;
                case "5":
                    calculateScorePlayerE();
                    break;
                case "6":
                    calculateScorePlayerF();
                    break;
                case "7":
                    calculateCard();
                    return;
                default:
                    System.out.printf("%s is an invalid input! Please enter again! \n\n", selection);
            }
        }
    }

    public static void calculateScorePlayerA()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter name of Player A: ");
        Golfer_ID_A = in.next();

        do {
            System.out.print("Enter Handicap Number: ");
            handicap_number_A = in.nextInt();

            if (handicap_number_A > 24 || handicap_number_A < 0)
                System.out.println(handicap_number_A + " is an invalid number! Please enter number 0 - 24!");

        } while (handicap_number_A > 24 || handicap_number_A < 0);

        int sum = 0;

        for (int i = 0; i <= 17; i++)
        {
            System.out.printf("Hole Number = %-5d", (i + 1));
            System.out.print("Enter Score: ");
            Golfer_score_A[i] = in.nextInt();
            sum += Golfer_score_A[i];
        }

        System.out.println("Total Score of " + Golfer_ID_A + " = " + sum);
        Netscore1 = sum - handicap_number_A;
        System.out.println("Netscore of " + Golfer_ID_A + " = " + Netscore1);
        System.out.println();
    }

    public static void calculateScorePlayerB()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter name of Player B: ");
        Golfer_ID_B = in.next();

        do {
            System.out.print("Enter Handicap Number: ");
            handicap_number_B = in.nextInt();

            if (handicap_number_B > 24 || handicap_number_B < 0)
                System.out.println(handicap_number_B + " is an invalid number! Please enter number 0 - 24!");

        } while (handicap_number_B > 24 || handicap_number_B < 0);

        int sum = 0;

        for (int i = 0; i <= 17; i++)
        {
            System.out.printf("Hole Number = %-5d", (i + 1));
            System.out.print("Enter Score: ");
            Golfer_score_B[i] = in.nextInt();
            sum += Golfer_score_B[i];
        }

        System.out.println("Total Score of " + Golfer_ID_B + " = " + sum);
        Netscore2 = sum - handicap_number_B;
        System.out.println("Netscore of " + Golfer_ID_B + " = " + Netscore2);
        System.out.println();
    }

    public static void calculateScorePlayerC()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter name of Player C: ");
        Golfer_ID_C = in.next();

        do {
            System.out.print("Enter Handicap Number: ");
            handicap_number_C = in.nextInt();

            if (handicap_number_C > 24 || handicap_number_C < 0)
                System.out.println(handicap_number_C + " is an invalid number! Please enter number 0 - 24!");

        } while (handicap_number_C > 24 || handicap_number_C < 0);

        int sum = 0;

        for (int i = 0; i <= 17; i++)
        {
            System.out.printf("Hole Number = %-5d", (i + 1));
            System.out.print("Enter Score: ");
            Golfer_score_C[i] = in.nextInt();
            sum += Golfer_score_C[i];
        }

        System.out.println("Total Score of " + Golfer_ID_C + " = " + sum);
        Netscore3 = sum - handicap_number_C;
        System.out.println("Netscore of " + Golfer_ID_C + " = " + Netscore3);
        System.out.println();
    }

    public static void calculateScorePlayerD()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter name of Player D: ");
        Golfer_ID_D = in.next();

        do {
            System.out.print("Enter Handicap Number: ");
            handicap_number_D = in.nextInt();

            if (handicap_number_D > 24 || handicap_number_D < 0)
                System.out.println(handicap_number_D + " is an invalid number! Please enter number 0 - 24!");

        } while (handicap_number_D > 24 || handicap_number_D < 0);

        int sum = 0;

        for (int i = 0; i <= 17; i++)
        {
            System.out.printf("Hole Number = %-5d", (i + 1));
            System.out.print("Enter Score: ");
            Golfer_score_D[i] = in.nextInt();
            sum += Golfer_score_D[i];
        }

        System.out.println("Total Score of " + Golfer_ID_D + " = " + sum);
        Netscore4 = sum - handicap_number_D;
        System.out.println("Netscore of " + Golfer_ID_D + " = " + Netscore4);
        System.out.println();
    }

    public static void calculateScorePlayerE()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter name of Player E: ");
        Golfer_ID_E = in.next();

        do {
            System.out.print("Enter Handicap Number: ");
            handicap_number_E = in.nextInt();

            if (handicap_number_E > 24 || handicap_number_E < 0)
                System.out.println(handicap_number_E + " is an invalid number! Please enter number 0 - 24!");

        } while (handicap_number_E > 24 || handicap_number_E < 0);

        int sum = 0;

        for (int i = 0; i <= 17; i++)
        {
            System.out.printf("Hole Number = %-5d", (i + 1));
            System.out.print("Enter Score: ");
            Golfer_score_E[i] = in.nextInt();
            sum += Golfer_score_E[i];
        }

        System.out.println("Total Score of " + Golfer_ID_E + " = " + sum);
        Netscore5 = sum - handicap_number_E;
        System.out.println("Netscore of " + Golfer_ID_E + " = " + Netscore5);
        System.out.println();
    }

    public static void calculateScorePlayerF()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter name of Player F: ");
        Golfer_ID_F = in.next();

        do {
            System.out.print("Enter Handicap Number: ");
            handicap_number_F = in.nextInt();

            if (handicap_number_F > 24 || handicap_number_F < 0)
                System.out.println(handicap_number_F + " is an invalid number! Please enter number 0 - 24!");

        } while (handicap_number_F > 24 || handicap_number_F < 0);

        int sum = 0;

        for (int i = 0; i <= 17; i++)
        {
            System.out.printf("Hole Number = %-5d", (i + 1));
            System.out.print("Enter Score: ");
            Golfer_score_F[i] = in.nextInt();
            sum += Golfer_score_F[i];
        }

        System.out.println("Total Score of " + Golfer_ID_F + " = " + sum);
        Netscore6 = sum - handicap_number_F;
        System.out.println("Netscore of " + Golfer_ID_F + " = " + Netscore6);
        System.out.println();
    }

    public static void calculateWinner()
    {
        if (Netscore6 < Netscore5 && Netscore6 < Netscore4 && Netscore6 < Netscore3 && Netscore6 < Netscore2 && Netscore6 < Netscore1)
            System.out.println("The Winner is Player F: " + Golfer_ID_F);
        else if (Netscore5 < Netscore4 && Netscore5 < Netscore3 && Netscore5 < Netscore2 && Netscore5 < Netscore1)
            System.out.println("The Winner is Player E: " + Golfer_ID_E);
        else if (Netscore4 < Netscore3 && Netscore4 < Netscore2 && Netscore4 < Netscore1)
            System.out.println("The Winner is Player D: " + Golfer_ID_D);
        else if (Netscore3 < Netscore2 && Netscore3 < Netscore1)
            System.out.println("The Winner is Player C: " + Golfer_ID_C);
        else if (Netscore2 < Netscore1)
            System.out.println("The Winner is Player B: " + Golfer_ID_B);
        else
            System.out.println("The Winner is Player A: \n" + Golfer_ID_A);
    }

    public static void calculateCard()
    {
        int[] par = new int[18];
        int[] index = new int[18];
        int[] blue = new int[18];
        int[] white = new int[18];
        int sum_blue1 = 0;
        int sum_white1 = 0;
        int sum_par1 = 0;
        int sum_index1 = 0;
        int sum_blue2 = 0;
        int sum_white2 = 0;
        int sum_par2 = 0;
        int sum_index2 = 0;
        int sum_golfer_score_A1 = 0;
        int sum_golfer_score_B1 = 0;
        int sum_golfer_score_C1 = 0;
        int sum_golfer_score_D1 = 0;
        int sum_golfer_score_E1 = 0;
        int sum_golfer_score_F1 = 0;
        int sum_golfer_score_A2 = 0;
        int sum_golfer_score_B2 = 0;
        int sum_golfer_score_C2 = 0;
        int sum_golfer_score_D2 = 0;
        int sum_golfer_score_E2 = 0;
        int sum_golfer_score_F2 = 0;

        System.out.println("SINTOK NINE");
        System.out.printf("%-7s %-7s %-7s %-7s %-7s %-7c %-7c %-7c %-7c %-7c %-7c \n","Hole", "Blue", "White", "Index", "Par", 'A', 'B', 'C', 'D', 'E', 'F');

        for (int i = 0; i <= 8; i++)
        {
            par[i] = Par.calculatePar(i);
            int hole_par = par[i];
            sum_par1 += par[i];
            index[i] = Index.calculateIndex(i);
            int hole_index = index[i];
            sum_index1 += index[i];
            blue[i] = Blue.calculateBlue(i);
            int blue_yardage = blue[i];
            sum_blue1 += blue[i];
            white[i] = White.calculateWhite(i);
            int white_yardage = white[i];
            sum_white1 += white[i];
            sum_golfer_score_A1 += Golfer_score_A[i];
            sum_golfer_score_B1 += Golfer_score_B[i];
            sum_golfer_score_C1 += Golfer_score_C[i];
            sum_golfer_score_D1 += Golfer_score_D[i];
            sum_golfer_score_E1 += Golfer_score_E[i];
            sum_golfer_score_F1 += Golfer_score_F[i];

            System.out.printf("%-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d \n", (i + 1), blue_yardage, white_yardage, hole_index, hole_par, Golfer_score_A[i], Golfer_score_B[i], Golfer_score_C[i], Golfer_score_D[i], Golfer_score_E[i], Golfer_score_F[i]);
        }

        System.out.printf("%-7s %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d \n\n", "OUT", sum_blue1, sum_white1, sum_index1,sum_par1, sum_golfer_score_A1, sum_golfer_score_B1, sum_golfer_score_C1, sum_golfer_score_D1, sum_golfer_score_E1, sum_golfer_score_F1);

        System.out.println("KERUING NINE");

        for (int i = 9; i <= 17; i++)
        {
            par[i] = Par.calculatePar(i);
            int hole_par = par[i];
            sum_par2 += par[i];
            index[i] = Index.calculateIndex(i);
            int hole_index = index[i];
            sum_index2 += index[i];
            blue[i] = Blue.calculateBlue(i);
            int blue_yardage = blue[i];
            sum_blue2 += blue[i];
            white[i] = White.calculateWhite(i);
            int white_yardage = white[i];
            sum_white2 += white[i];
            sum_golfer_score_A2 += Golfer_score_A[i];
            sum_golfer_score_B2 += Golfer_score_B[i];
            sum_golfer_score_C2 += Golfer_score_C[i];
            sum_golfer_score_D2 += Golfer_score_D[i];
            sum_golfer_score_E2 += Golfer_score_E[i];
            sum_golfer_score_F2 += Golfer_score_F[i];

            System.out.printf("%-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d \n", (i+1), (blue_yardage), (white_yardage), (hole_index), (hole_par), (Golfer_score_A[i]), (Golfer_score_B[i]), (Golfer_score_C[i]), (Golfer_score_D[i]), (Golfer_score_E[i]), (Golfer_score_F[i]));
        }

        System.out.printf("%-7s %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d \n", "IN", sum_blue2, sum_white2, sum_index2, sum_par2, sum_golfer_score_A2, sum_golfer_score_B2, sum_golfer_score_C2, sum_golfer_score_D2, sum_golfer_score_E2, sum_golfer_score_F2);
        System.out.printf("%-7s %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d \n", "OUT", sum_blue1, sum_white1, sum_index1, sum_par1, sum_golfer_score_A1, sum_golfer_score_B1, sum_golfer_score_C1, sum_golfer_score_D1, sum_golfer_score_E1, sum_golfer_score_F1);
        System.out.printf("%-7s %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d %-7d \n", "Total", (sum_blue1 + sum_blue2), (sum_white1 + sum_white2), (sum_index1 + sum_index2), (sum_par1+ sum_par2), (sum_golfer_score_A1+sum_golfer_score_A2), (sum_golfer_score_B1+sum_golfer_score_B2), (sum_golfer_score_C1+sum_golfer_score_C2), (sum_golfer_score_D1+sum_golfer_score_D2), (sum_golfer_score_E1+sum_golfer_score_E2), (sum_golfer_score_F1+sum_golfer_score_F2));
        System.out.printf("%-39s %-7d %-7d %-7d %-7d %-7d %-7d \n", "Handicap", handicap_number_A, handicap_number_B, handicap_number_C, handicap_number_D, handicap_number_E, handicap_number_F);
        System.out.printf("%-39s %-7d %-7d %-7d %-7d %-7d %-7d \n\n", "Netscore", Netscore1, Netscore2, Netscore3, Netscore4, Netscore5, Netscore6);
        calculateWinner();
    }
}