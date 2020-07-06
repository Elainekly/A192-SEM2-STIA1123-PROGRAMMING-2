public class Cat extends Animal
{
    private String name;
    
    public Cat (String name)
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
        System.out.println("Meow. I am a cat. My name is " + this.getName() + ".");
    }
}