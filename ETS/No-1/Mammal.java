
public class Mammal extends Animal
{
    private boolean hasFur;
    
    public Mammal(String name, int age, boolean hasFur)
    {
        super(name, age);
        this.hasFur = hasFur;
    }
}
