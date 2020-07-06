public class Dog extends Animal
{
    private String name;
    
    public Dog (String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    

    @Override
    public void introduceYourself()
    {
        System.out.println("Woof. I am a dog. My name is " + this.getName() + ".");
    }
}