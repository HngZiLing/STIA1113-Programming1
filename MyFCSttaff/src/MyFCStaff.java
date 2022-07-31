public class MyFCStaff
{
    private String name;
    private String staffID;
    private int totalHoursWork;
    private double totalSale;

    public MyFCStaff(String name, String staffID, int totalHoursWork, double totalSale)
    {
        this.name = name;
        this.staffID = staffID;
        this.totalHoursWork = totalHoursWork;
        this.totalSale = totalSale;
    }

    public double calculateCommission()
    {
        double commission = 0.0;

        if (totalSale > 150 && totalSale < 300)
            commission = totalSale * 0.05;

        else if (totalSale > 301 && totalSale < 500)
            commission = totalSale * 0.1;

        else if (totalSale > 500)
            commission = totalSale * 0.15;

        return commission;
    }

    public double calculateSalary()
    {
        double totalSalary = totalHoursWork * 8 + calculateCommission();
        return totalSalary;
    }

//    public void displaySalary()
//    {
//        System.out.printf("Staff Name   : %s \n", name);
//        System.out.printf("Staff ID     : MyFC%s \n", staffID);
//        System.out.printf("Hours Work   : %d \n", totalHoursWork);
//        System.out.printf("Total Sale   : RM %.2f \n",totalSale);
//        System.out.printf("Total Salary : RM %.2f \n", calculateSalary());
//    }

    public String toString()
    {
    return "Staff Name      : " + name + "\nStaffID         : MyFC" + staffID + "\nHours Work      : " + totalHoursWork
            + "\nTotal Sale      : RM " + totalSale + "\nTotal Salary    : RM " + calculateSalary();
    }
}






