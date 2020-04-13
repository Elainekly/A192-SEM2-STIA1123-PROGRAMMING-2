import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double a,b,c,d;
        
        System.out.println("Enter integer 1: ");
        a = keyboard.nextDouble();
        
        System.out.println("Enter integer 2: ");
        b = keyboard.nextDouble();
        
        System.out.println("Enter integer 3: ");
        c = keyboard.nextDouble();
        
        System.out.printf("The average of 3 integers is %.2f" , average(a, b, c));
        
        System.out.println();
        System.out.println("Enter another integer: ");
        d = keyboard.nextDouble();
        
        System.out.printf("The average of 4 integers is %.2f" , average(a, b, c, d));
        System.out.println();
    }// main method
    
    public static double average(double a, double b, double c)//average of 3 integers
    {
       double average = (a + b + c) / 3;
       return average;
    }
    
    public static double average(double a, double b, double c, double d)//average of 4 integers
    {
       double average = (a + b + c + d) / 4;
       return average;
    }
}