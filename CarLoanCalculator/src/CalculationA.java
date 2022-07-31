public class CalculationA
{
    public static double calculateLoan(double carPrice, double downPayment)
    {
        // Calculate the total loan need to be loaned after paying the down payment for the car
        double loan;
        loan = carPrice - downPayment;
        return loan;
    }

    public static double calculateInterest(double loan, double interestRate)
    {
        // Calculate the loan interest that needs to be repaid for one year
        double interest;
        interest = loan * (interestRate / 100);
        return interest;
    }

    public static double calculateMonthlyRepayment(double loan, int loanPeriod, double interest)
    {
        // Calculate the loan and interest to be repaid for one month
        double monthlyRepayment;
        monthlyRepayment = ((loan / loanPeriod) + interest) / 12;
        return monthlyRepayment;
    }
}