public class CalculationB
{
    public static double calculatePrincipal(double loan, int loanPeriod, double interest, int years)
    {
        // The principal in the final year will be the total amount that need to be repaid during the loan period
        double principal;
        principal = ((loan / loanPeriod) + interest) * years;
        return principal;
    }

    public static double calculateTotalInterest(double interest, int years)
    {
        // Calculate total interest for the year
        double totalInterest;
        totalInterest = interest * years;
        return totalInterest;
    }

    public static double calculateBalance(double loan, double interest, int loanPeriod, double principal)
    {
        // Calculate the amount of money left after paying off the loan and interest for the year
        double balance;
        balance = (loan + (interest * loanPeriod)) - principal;
        return balance;
    }
}
