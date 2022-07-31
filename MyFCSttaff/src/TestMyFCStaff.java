import java.util.Scanner;

public class TestMyFCStaff
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter staff name          : ");
        String name = scan.nextLine();

        System.out.print("Enter staff ID            : ");
        String staffID = scan.nextLine();

        System.out.print("Enter total hours work    : ");
        int totalHoursWork = scan.nextInt();

        System.out.print("Enter total sale          : ");
        double totalSale = scan.nextDouble();

        System.out.println();

        MyFCStaff myFCStaff = new MyFCStaff(name, staffID, totalHoursWork, totalSale);
//        myFCStaff.displaySalary();
        System.out.println(myFCStaff.toString());
    }
}




