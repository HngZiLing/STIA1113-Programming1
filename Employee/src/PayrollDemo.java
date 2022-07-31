public class PayrollDemo
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        Payroll payroll = new Payroll();

        employee.input();

        payroll.calculateNetPay(employee.getGrossPay(), employee.getStateTax(), employee.getFederalTax());

        payroll.printOutput();
    }
}