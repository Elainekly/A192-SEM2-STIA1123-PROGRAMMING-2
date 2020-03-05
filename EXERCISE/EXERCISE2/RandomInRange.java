import java.util.Scanner;
public class RandomInRange
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a number as first number:");
        int num1 = keyboard.nextInt();
        System.out.println("Please enter a number as second number:");
        int num2 = keyboard.nextInt();
        
        if (num1 > num2)
        {
            System.out.println("0");
        }
        else
        {
            int x = (int)(Math.random()*((num2-num1)+1))+num1;
            
            System.out.println("The random integer is " +x);
        }
    }
}