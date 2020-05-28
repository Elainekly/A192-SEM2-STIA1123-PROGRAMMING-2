public class SideBySide extends Refrigerator//inherence
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
    public void special()//Overiding
    {
        super.special();
        System.out.println("Some of this refrigerator has exterior ice and water dispenser in the door");
    }
}
