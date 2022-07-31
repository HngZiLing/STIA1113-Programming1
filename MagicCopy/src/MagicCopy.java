import java.util.Scanner;

public class MagicCopy
{
    // Declare class variable, because these variables need to be used in more than one method
    static int payCode, payCode1, payCode2, payCode3, worker;
    static double totalPayMonthlyWorker, totalPayHourlyWorker, totalPayCommissionWorker;

    public static void main(String[] args)
    {
        System.out.println("Welcome MagicCopy Sdn. Bhd.");

        // We need to enter the pay code and calculate the salary multiple times, so we need to use do-while loop
        do {
            Scanner code = new Scanner(System.in);
            System.out.print("\nEnter pay code: ");
            payCode = code.nextInt();

            /*
            payCode1, payCode2 and payCode3 is pay code that have been entered
            this conditional expression must be checked first,
            if this conditional expression is true, we don't need to calculate the salary again
            */
            if (payCode == payCode1 || payCode == payCode2 || payCode == payCode3)
                System.out.println("The monthly salary has been calculated!");
            
            else if (payCode == 1)
                calculatePayMonthlyWorker();

            else if (payCode == 2)
                calculatePayHourlyWorker();

            else if (payCode == 3)
                calculatePayCommWorker();

            else if (payCode >= 0)      // This is any positive value other than 1, 2 and 3
                System.out.println("Invalid code!");

        } while (payCode >= 0);         // When the pay code is positive value, this loop will continue to execute

        System.out.println("-------------------------------------------");
        System.out.printf("Total Salaries need to be paid = RM%.2f \n", totalPayMonthlyWorker + totalPayHourlyWorker + totalPayCommissionWorker);
        System.out.println("-------------------------------------------");

        System.out.println("Thank You MagicCopy Sdn. Bhd.");
    }


    public static void calculatePayMonthlyWorker()
    {
        double payMonthlyWorker = 2000;

        payCode1 = payCode;             // When the user has used this method, the pay code will be stored in payCode1

        Scanner people = new Scanner (System.in);
        System.out.print("Enter the number of workers: ");
        worker = people.nextInt();

        totalPayMonthlyWorker = payMonthlyWorker * worker;
        System.out.printf("Salary is RM%.2f \n", totalPayMonthlyWorker);
    }


    public static void calculatePayHourlyWorker()
    {
        double payHourlyWorker = 30, payOvertimeHours;
        int totalHours, overtimeHours;

        payCode2 = payCode;             // When the user has used this method, the pay code will be stored in payCode2

        Scanner people = new Scanner (System.in);
        System.out.print("Enter the number of workers: ");
        worker = people.nextInt();

        Scanner time = new Scanner (System.in);
        System.out.print("Enter the number of hours worked: ");
        totalHours = time.nextInt();

        overtimeHours = totalHours - 40;            // When working hours exceed 40 hours, the excess time is overtime hours
        payOvertimeHours = payHourlyWorker * 1.5;   // Overtime pay is one and a half times normal pay

        if (totalHours <= 40)           // When total hours less than 40, it means workers do not work overtime and no need to pay overtime
            totalPayHourlyWorker = payHourlyWorker * totalHours * worker;

        else                            // When total hours more than 40, user need to pay overtime
            totalPayHourlyWorker = ((payHourlyWorker * 40) + (payOvertimeHours * overtimeHours)) * worker;

        System.out.printf("Salary is RM%.2f \n", totalPayHourlyWorker);
    }


    public static void calculatePayCommWorker()
    {
        double payCommissionWorker = 500, commission = 0.055, weeklySales;

        payCode3 = payCode;             // When the user has used this method, the pay code will be stored in payCode3

        Scanner people = new Scanner (System.in);
        System.out.print("Enter the number of workers: ");
        worker = people.nextInt();

        Scanner sales = new Scanner (System.in);
        System.out.print("Enter the amount of weekly sales: ");
        weeklySales = sales.nextDouble();

        totalPayCommissionWorker = (payCommissionWorker + (commission * weeklySales)) * worker;

        System.out.printf("Salary is RM%.2f \n", totalPayCommissionWorker);
    }
}