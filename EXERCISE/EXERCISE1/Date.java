import java.util.Scanner;
public class Date
{  
    public static void main(String args[])
    {  
        Scanner keyboard = new Scanner(System.in);
        
        String date;
        
        System.out.println("Please enter today date: ");
        date = keyboard.next();
        
        date = date.replace("/", ".");
        
        System.out.println(date);
    }  
}  
