import java.util.Scanner;
public class CarLoanCalculator
{
    // Declare class variable
    static double carPrice, downPayment, interestRate, monthlyRepayment, loan, interest;
    static int loanPeriod, years;
    static double principal, totalInterest, balance;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);

        // The system will proceed to the next step only if the user entered car price of 30000 and above
        do {
            System.out.print("Car Price (RM)\t\t: ");
            carPrice = scan.nextDouble();

            if (carPrice < 30000)
                System.out.println(carPrice + " is an invalid number! Car price must be RM30000 and above!\n");

        } while (carPrice < 30000);


        // The system will proceed to the next step only if the down payment entered by the user is positive value
        do {
            System.out.print("Down Payment (RM)\t: ");
            downPayment = scan.nextDouble();

            if (downPayment < 0)
                System.out.println(downPayment +" is an invalid number! Down payment can only be positive number!\n");

        } while (downPayment < 0);


        // The system will proceed to the next step only if the loan period entered by the user is 5 until 9
        do {
            System.out.print("Loan Period (Years)\t: ");
            loanPeriod = scan.nextInt();

            if (loanPeriod < 5 || loanPeriod > 9)
                System.out.println(loanPeriod + " is an invalid number! Loan period must be between 5 years and 9 years!\n");

        } while (loanPeriod < 5 || loanPeriod > 9);


        // The system will proceed to the next step only if the loan period entered by the user is 3 until 7
        do {
            System.out.print("Interest Rate (%)\t: ");
            interestRate = scan.nextDouble();

            if (interestRate < 3 || interestRate > 7)
                System.out.println(interestRate + " is an invalid number! Interest rate must be between 3% and 7%!\n");

        } while (interestRate < 3 || interestRate > 7);


        loan = CalculationA.calculateLoan(carPrice, downPayment);
        interest = CalculationA.calculateInterest(loan, interestRate);
        monthlyRepayment = CalculationA.calculateMonthlyRepayment(loan, loanPeriod, interest);

        System.out.printf("\nMonthly Repayment\t: RM%,.2f \n\n", monthlyRepayment);


        String line = "----------------------------------------------------------------";

        System.out.println(line);
        System.out.printf("| %-10s| %-15s| %-15s| %-15s|\n", "YEARS", "PRINCIPAL", "INTEREST", "BALANCE");
        System.out.println(line);

        // calculate principal, interest and balance for every year during loan period
        for (years = 1; years <= loanPeriod ; years++)
        {
            // print 1st
            if (years == 1)
                System.out.printf("| %d%-9s", years,"st");

                // print 2nd
            else if (years == 2)
                System.out.printf("| %d%-9s", years,"nd");

                // print 3rd
            else if (years == 3)
                System.out.printf("| %d%-9s", years,"rd");

                // print 4th, 5th, 6th, 7th,......
            else
                System.out.printf("| %d%-9s", years,"th");

            principal = CalculationB.calculatePrincipal(loan, loanPeriod, interest, years);
            System.out.printf("| %,-15.2f", principal);

            totalInterest = CalculationB.calculateTotalInterest(interest, years);
            System.out.printf("| %,-15.2f", totalInterest);

            balance = CalculationB.calculateBalance(loan, interest, loanPeriod, principal);
            System.out.printf("| %,-15.2f|\n", balance);
        }
        System.out.println(line);
    }
}
