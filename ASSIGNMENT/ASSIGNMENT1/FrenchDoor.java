public class FrenchDoor extends Refrigerator//inherence
{   
    private String doorNum = "more than 2";//encap
    
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
        System.out.println("Large capacity");
        System.out.println("Some of this refrigerator has Wi-Fi capable screen on the door");
        System.out.println("Some of this refrigerator has coffeemaker in the door");
    }
}

