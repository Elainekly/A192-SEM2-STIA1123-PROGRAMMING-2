import java.util.Scanner;
public class Fourdigitnumber
{  
    public static void main(String args[])
    {  
        Scanner keyboard = new Scanner(System.in);
        
        String num, number;
        int sum = 0;
        
        System.out.println("Please enter a four-digit number: ");
        num = keyboard.next();
        
        for (int i = 0; i < num.length(); i++)
        {
            System.out.println(num.charAt(i));
            number = String.valueOf(num.charAt(i));
            
            sum = sum + Integer.parseInt(number);
        }
        System.out.println("The sum of the digit is " + sum);
    }  
}  
