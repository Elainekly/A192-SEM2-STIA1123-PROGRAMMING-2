import java.util.Scanner;
class Employee
{
    int id;
    double grossPay, stateTax, federalTax;
    
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your employee ID number\t： ");
        id = keyboard.nextInt();
        
        System.out.print("Enter your Gross Pay\t\t: RM ");
        grossPay = keyboard.nextDouble();
        
        System.out.print("Enter your State Tax\t\t: RM ");
        stateTax = keyboard.nextDouble();
        
        System.out.print("Enter your Federal Tax\t\t: RM ");
        federalTax = keyboard.nextDouble();
    }
}

class Payroll
{
    double netPay, grossPay, stateTax, federalTax;
    
    public Payroll(double grossPay, double stateTax, double federalTax)
    {
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }
    
    public double calculateNetPay()
    {
        netPay = grossPay - stateTax - federalTax;
        return netPay;
    }
    
    public void printOutput()
    {
        System.out.println("Net Pay is: RM " + calculateNetPay());
    }
}

public class PayrollDemo
{
    public static void main(String[] args)
    {
        Employee employ = new Employee();
        employ.input();
        Payroll payroll = new Payroll(employ.grossPay, employ.stateTax, employ.federalTax);
        payroll.printOutput();
    }
}