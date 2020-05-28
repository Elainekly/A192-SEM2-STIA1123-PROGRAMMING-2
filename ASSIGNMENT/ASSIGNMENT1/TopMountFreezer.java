public class TopMountFreezer extends Refrigerator//inherence
{
    private String doorNum = "2";//encap

    public void setDoorNum(String newDoorNum)
    {
        doorNum = newDoorNum;
    }
    
    public String getDoorNum()
    {
        return doorNum;
    }
    
    @Override
    public void special()//overiding
    {
        super.special();
        System.out.println("Cheaper");
        System.out.println("The top compartment is the freezer");
        System.out.println("The lower compartment is for fresh food");
    }
    
    public void common()
    {
        System.out.println("Top Mount Refrigerator are the most common type of refrigetation");
    }
}
