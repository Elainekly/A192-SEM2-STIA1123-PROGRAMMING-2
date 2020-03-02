import java.util.Scanner;
public class FunnyString
{
    public static void main(String []args)
    {
        Scanner keyboard = new Scanner (System.in);
        
        String colour, food, animal, friend;
        
        System.out.println("Please enter your favourite colour: " );
        colour = keyboard.next();
        
        System.out.println("Please enter your favourite food: ");
        food = keyboard.next();
        
        System.out.println("Please enter your favourite animal: ");
        animal = keyboard.next();
        
        System.out.println("Please enter your first name of a friend: ");
        friend = keyboard.next();
        
        System.out.println("I had a dream that " + friend + " ate a " + colour +
                " " + animal + " and said it tasted like " + food + "!");
    }
}
