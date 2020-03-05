public class Exercise2Q1
{
    public static void main(String[] args)
    {    
        System.out.println("Number\t\t\tSquare\t\t\tCube");
        double num[][] = new double [11][3];
        int i;
        
        for (i = 0; i < num.length; i++)
        {
            System.out.println(i + "\t\t\t" + i*i + "\t\t\t" + (int)Math.pow(i,3));
        }
    }
}