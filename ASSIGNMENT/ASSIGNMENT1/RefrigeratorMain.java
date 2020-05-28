public class RefrigeratorMain
{
    public static void main(String[]args)
    {
        Refrigerator r = new Refrigerator();
        FrenchDoor r1 = new FrenchDoor();
        SideBySide r2 = new SideBySide();
        TopMountFreezer r3 = new TopMountFreezer();
        BottomMountFreezer r4 = new BottomMountFreezer();

        r.use();
        System.out.println("---Refrigerator Feature---");
        r.open();
        r.close();
        r.tempuratureUp();
        r.tempuratureDown();

        System.out.println("");
        System.out.println("French Door Refrigerator");
        System.out.println("Number of the door of French Door Refrigerator is " 
                + r1.getDoorNum());
        r1.special();
        
        System.out.println("");
        System.out.println("Side By Side Refrigerator");
        System.out.println("Number of the door of Side By Side Refrigerator is " 
                + r2.getDoorNum());
        r2.special();

        System.out.println("");
        System.out.println("Top Mount Freezer");
        System.out.println("Number of the door of Top Mount Freezer is " 
                + r3.getDoorNum());
        r3.special();
        r3.common();

        System.out.println("");
        System.out.println("Bottom Mount Freezer");
        System.out.println("Number of the door of Bottom Mount Freezer is " 
                + r4.getDoorNum());
        r4.special();
    }
}
