public class SideBySide extends Refrigerator
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
        System.out.println("Some of this refrigerator has exterior ice and water dispenser in the door");
    }
}
