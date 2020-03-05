import java.util.Scanner;
public class PrintReverse
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String x = keyboard.nextLine();
        
        for (int i = x.length()-1; i >= 0; i--)
        {
            System.out.print(x.charAt(i));
        }    
        System.out.println();
    }
}