import java.util.Scanner;
public class TestBook
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
    
        String title, highestPriceBook = " ";
        double price, highestPrice = 0;
    
        //Q1
        System.out.print("Please enter number of book: ");
        int n = keyboard.nextInt();
        //Q2
        Book myLibrary[] = new Book[n];
    
        for (int i = 0; i < myLibrary.length; i++)
        {
            keyboard.nextLine();
            System.out.println("Enter the title of the book: ");
            title = keyboard.nextLine();
            
            System.out.println("Enter the price of the book: ");
            price = keyboard.nextDouble();
        
            myLibrary[i] = new Book(title, price);
        
            if (myLibrary[i].getPrice() > highestPrice)
            {
                highestPriceBook = myLibrary[i].getTitle();
                highestPrice = myLibrary[i].getPrice();
            }
        }
    
        //Q3
        System.out.printf("The title of the book with the highest price is " 
            + highestPriceBook + " with RM%.2f " , highestPrice);
    
        System.out.println();
    
        //Q4
        System.out.println("The title of books that contain the term \"Java\"： ");
        for (int j = 0; j < n; j++)
        {
            if (myLibrary[j].getTitle().indexOf("Java")!= -1)
                System.out.println(myLibrary[j].getTitle());
            
        }
    }
}

class Book
{
    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p)
    {        
        title = t;
        price = p;
    }
    
    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }
}
