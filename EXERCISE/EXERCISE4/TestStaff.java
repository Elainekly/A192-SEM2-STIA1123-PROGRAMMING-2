import java.util.Scanner;
class TestStaff
{
    static Scanner console = new Scanner(System.in);	
    public static void main(String arg[])
    {
        String name, staffID;
        double salary;
        int workingDay;
        
        System.out.println("Please enter a staff name: ");
        name = console.nextLine();
        
        System.out.println("Please enter a staff ID: ");
        staffID = console.nextLine();
        
        System.out.println("Please enter working days: ");
        workingDay = console.nextInt();
        
        salary = workingDay * 35.0;
        
        System.out.println("Staff Name: " + name);
        System.out.println("Staff ID: " + staffID);
        System.out.println("Salary: RM " + salary);
    }
}//end class