import java.util.Scanner;
class MyFCStaff
{
    String name, staffID;
    double hoursWork, totalSale, commission, totalSalary;
    
    public MyFCStaff(String name, String staffID, double hoursWork, double totalSale)
    {
        this.name = name;
        this.staffID = staffID;
        this.hoursWork = hoursWork;
        this.totalSale = totalSale;
    } //Constructor
    
    public double calculateCommission()
    {
        if (totalSale >= 150.00 && totalSale <= 300.00)
        {
            commission = (0.05) * totalSale;
        }
        else if (totalSale >= 301.00 && totalSale <= 500.00)
        {
            commission = (0.1) * totalSale;
        }
        else if (totalSale > 500.00)
        {
            commission = (0.15) * totalSale;
        }
        else
        {
            commission = 0;
        }
        return commission;
    } //Calculate Commission
    
    public double calculateSalary()
    {
        totalSalary = (hoursWork * 8) + calculateCommission();
        return totalSalary;
    } //Calculate Salary
    
    public void displaySalary()
    {
        System.out.println("---Salary---");
        System.out.println("Staff Name\t: " + name);
        System.out.println("Staff ID\t: " + staffID);
        System.out.println("Hours Work\t: " + hoursWork);
        System.out.println("Total Sale\t: RM " + totalSale);
        System.out.println("Total Salary\t: RM " + calculateSalary());
    } //Dispaly Salary
}

public class TestMyFCStaff
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name, staffID;
        double hoursWork, totalSale;
        
        //Enter staff name, staff ID, working hours and total sale
        System.out.println("Please enter a staff name: ");
        name = keyboard.nextLine();
        
        System.out.println("Please enter a staff ID: ");
        staffID = keyboard.nextLine();
        
        System.out.println("Please enter staff's working hours: ");
        hoursWork = keyboard.nextDouble();
        
        System.out.println("Please enter total sale: ");
        totalSale = keyboard.nextDouble();
        
        //display information from MyFCStaff
        MyFCStaff info = new MyFCStaff (name, staffID, hoursWork, totalSale);
        info.displaySalary();
    }
}