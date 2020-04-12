import java.util.Random;
public class E3Q4
{
    public static void main (String[] args)
    {
        Random rd = new Random();
        
        int num1 = rd.nextInt(100);
        int num2 = rd.nextInt(100);
        
        System.out.println("Number1 = " + num1);
        System.out.println("Number2 = " + num2);
        System.out.println(Math.max(num1, num2));
    }
}