public class Cow extends Animal
{
    // 1) Instance variables
    public String name;

    // 2) Constructor
    public Cow (String name, String type, String sound)
    {
        super (type, sound);
        this.name = name;
    }

    // 4) Getters
    public String getName ()
    {
        return name;
    }

    // 5) Setters
    public void setName ()
    {
        this.name = name;
    }

    // 3) toString

} // end Cow class