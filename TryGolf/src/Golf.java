import java.util.Scanner;

public class Golf
{
    static int handicap;

    public static void main(String[] args) {

        System.out.println("************************************************************************");
        System.out.println("\t\t\t\t\tWelcome to Golf Scoring System");
        System.out.println("************************************************************************\n");

        Scanner scan = new Scanner(System.in);

        String[] player = new String[6];
        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F'};

        int i;

        for (i = 0; i < player.length; i++) {
            System.out.print("Enter the name of Player-" + letter[i] + ": ");
            player[i] = scan.nextLine();

            do {
                System.out.print("Enter the handicap of Player-" + letter[i] + ": ");
                handicap = scan.nextInt();

                if (handicap < 0 || handicap > 24)
                    System.out.println("Handicap cannot higher than 24 or lower than 0.");

            } while (handicap < 0 || handicap > 24);

            scan.nextLine();
            System.out.println();
        }

        System.out.println();

        int[] par = {5, 4, 4, 4, 5, 3, 4, 3, 4, 4, 4, 3, 5, 3, 4, 4, 5, 4};

        int hole;
        int golfer;
        int[][] score = new int[18][6];

        for (i = 0; i < player.length; i++)
        {
            for (golfer = 0; golfer < 6; golfer++)
            {
                System.out.println("Enter the scores of Player-" + letter[i] + " : " + player[i]);
                for (hole = 0; hole < 18; hole++)
                {
                    System.out.printf("Hole-%2d (%d): ", (i + 1), par[i]);
                    score[hole][golfer] = scan.nextInt();
                    i++;
                }
            }
        }
    }
}


