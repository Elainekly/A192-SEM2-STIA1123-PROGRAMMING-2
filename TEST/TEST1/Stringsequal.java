import java.util.Scanner;
public class Stringsequal
{
    public static void main (String []args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s1 = keyboard.nextLine();
        
        System.out.println("Please enter a string: ");
        String s2 =keyboard.nextLine();
        
        if (s1.equals(s2))
            System.out.println("Two strings are equal.");
        else
            System.out.println("Two strings are not equal.");
    }
}