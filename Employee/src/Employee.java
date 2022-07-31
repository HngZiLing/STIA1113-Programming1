import java.util.Scanner;

public class Employee
{
    private String employeeId;
    private double grossPay;
    private double stateTax;
    private double federalTax;

    public void input()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your employee ID number : ");
        employeeId = scan.nextLine();

        System.out.print("Enter your Gross Pay          : RM ");
        grossPay = scan.nextDouble();

        System.out.print("Enter your State Tax          : RM ");
        stateTax = scan.nextDouble();

        System.out.print("Enter Federal Tax             : RM ");
        federalTax = scan.nextDouble();
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public double getGrossPay()
    {
        return grossPay;
    }

    public double getStateTax()
    {
        return stateTax;
    }

    public double getFederalTax()
    {
        return federalTax;
    }
}