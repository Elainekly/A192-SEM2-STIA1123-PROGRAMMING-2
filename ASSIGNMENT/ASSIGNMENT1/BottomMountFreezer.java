public class BottomMountFreezer extends Refrigerator//inherence
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
    public void special()//oberriding
    {
        super.special();
        System.out.println("The top compartment is for fresh food");
        System.out.println("The lower compartment is the freezer");
    }
}
