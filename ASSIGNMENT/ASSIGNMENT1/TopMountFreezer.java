public class TopMountFreezer extends Refrigerator
{
    private String doorNum = "2";

    public void setDoorNum(String newDoorNum)
    {
        doorNum = newDoorNum;
    }
    
    public String getDoorNum()
    {
        return doorNum;
    }
    
    @Override
    public void special()
    {
        super.special();
        System.out.println("Cheaper");
        System.out.println("The top compartment is the freezer");
        System.out.println("The lower compartment is for fresh food");
    }
    
    public static void common()
    {
        System.out.println("Top Mount Refrigerator are the most common type of refrigetation");
    }
}
