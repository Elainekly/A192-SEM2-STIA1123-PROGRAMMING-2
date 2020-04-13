import java.util.*;
public class TriangleDemo
{
    public static void main(String[] args)
    {
        //create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Create a Triangle object.
        Triangle tg = new Triangle();

        // Prompt user to input value for height and base
        System.out.println("Please enter height\t: ");
        double height = keyboard.nextDouble();
        System.out.println("Please enter base\t: ");
        double base = keyboard.nextDouble();
        
        //Set the height and base (use mutator) 
        tg.set(height, base);
        
        // Display the height, base and area (use accessor)
        System.out.println("The pyramid's height is "+ tg.getHeight());
        System.out.println("The pyramid's base is "+ tg.getBase());
        System.out.println("The pyramid's area is "+ tg.getArea());
      
   }
}
