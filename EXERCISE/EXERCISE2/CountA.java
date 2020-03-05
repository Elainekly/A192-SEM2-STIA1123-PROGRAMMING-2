import java.util.Scanner;
public class CountA
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String x;
        int i, num;
        
        System.out.println("Please enter a string: ");
        x = keyboard.nextLine();
        
        num = 0;
        for (i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) == 'A')
            {
                num++;
            }
        }
        System.out.println("The number of times the character 'A' is found in the string is " +num);
    }
}