import java.util.Scanner;
public class StaffIncomeReport
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the staff name:");
        String name = keyboard.nextLine();
        System.out.println("Please enter the staff ID:");
        String id = keyboard.nextLine();
        System.out.println("Please enter the income type:");
        String incomeType = keyboard.nextLine();
        System.out.println("Please enter the income amount:");
        double amount = keyboard.nextDouble();
        System.out.println("Please enter the income tax percentage:");
        double tax = keyboard.nextDouble();
        
        Income income = new Income(incomeType, amount, tax);
        Staff info = new Staff(name, id, income);
        
        info.displayStaffInfo();
        info.displayIncomeInfo();
    }
} 

class Income
{
    String incomeType;
    double amount;
    double tax;
    double totalTax;
    
    Income (String incomeType, double amount, double tax)
    {
        this.incomeType = incomeType;
        this.amount = amount;
        this.tax = tax;
    }
    
    String getIncomeType()
    {
        return incomeType;
    }
    
    double getAmount()
    {
        return amount;
    }
    
    double getTax()
    {
        return tax;
    }
    
    double getTotalTax()
    {
        totalTax = (tax/100) * amount;
        return totalTax;
    }
}
        
class Staff
{
    String name;
    String id;
    Income income;
    
    Staff(String name, String id, Income income)
    {
        this.name = name;
        this.id = id;
        this.income = income;        
    }
    
    String getName()
    {
        return name;
    }
    
    String getId()
    {
        return id;
    }
    
    double calculateNetIncome()
    {
        return income.getAmount() - income.getTotalTax();
    }
    
    void displayStaffInfo()
    {
        System.out.println("-----------Staff Info-----------");
        System.out.println("Staff Name: " + name);
        System.out.println("ID: " + id);
    }
    
    void displayIncomeInfo()
    {
        System.out.println("-----------Income Info-----------");
        System.out.println("Income Type: " + income.getIncomeType());
        System.out.println("Income Amount: " + "RM" + income.getAmount());
        System.out.println("Income Tax Percentage: " + income.getTax() + "%");
        System.out.println("Total Tax Paid: " + "RM" + income.getTotalTax());
        System.out.println("Total Net Income: " + "RM" + calculateNetIncome());
    }
}
