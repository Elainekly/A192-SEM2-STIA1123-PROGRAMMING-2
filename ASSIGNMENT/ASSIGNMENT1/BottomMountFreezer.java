public class BottomMountFreezer extends Refrigerator
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
        System.out.println("The top compartment is for fresh food");
        System.out.println("The lower compartment is the freezer");
    }
}
