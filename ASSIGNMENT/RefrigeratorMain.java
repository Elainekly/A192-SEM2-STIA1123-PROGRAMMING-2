public class RefrigeratorMain
{
    public static void main (String[] args)
    {
        FrenchDoor r1 = new FrenchDoor();
        SideBySide r2 = new SideBySide();
        TopMountFreezer r3 = new TopMountFreezer();
        BottomMountFreezer r4 = new BottomMountFreezer();
        
        System.out.println("Number of the door of French Door Refrigerator is " + r1.doorNum);
        
        r2.open();
        r1.tempuratureUp();
        r3.common();
        r4.special();
    }
}