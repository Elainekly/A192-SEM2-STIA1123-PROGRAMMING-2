import java.util.Scanner;
public class TestStudent
{  
    public static void main (String [] args)
    {
	Scanner input = new Scanner(System.in);
        String matricNo;
	double test1,test2;
	
	Student [] studDegree = new Student[3];
	//complete your code here
        for (int i = 0; i < studDegree.length; i++)
        {
            System.out.print("Matric No\t: ");
            matricNo = input.next() + input.nextLine();
            
            System.out.print("Test 1\t\t: ");
            test1 = input.nextDouble();
            
            System.out.print("Test2\t\t: ");
            test2 = input.nextDouble();
            
            studDegree[i] = new Student(matricNo, test1, test2);
        }
        System.out.println("****************************************");
        System.out.println("\tSTUDENT INFORMATION");
        System.out.println("****************************************");
        System.out.println("Matric No\t\tAverage Mark");
        
        for (int x = 0; x < studDegree.length; x++)
        {
            studDegree[x].calculateAverage();
            System.out.println(studDegree[x].getStudentInfo());
        }
    }//end of main method
}//end of class TestStudent
