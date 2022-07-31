public class Payroll
{
    private double netPay;

    public void calculateNetPay(double grossPay, double stateTax, double federalTax)
    {
        netPay = grossPay - stateTax - federalTax;
    }

    public void printOutput()
    {
        System.out.printf("\nNet pay is  : RM %.2f \n", netPay);
    }
}