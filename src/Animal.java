public class Animal
{
    // 1) Instance variables
    public String type;
    public String sound;

    // 2) Constructors
    public Animal (String type, String sound)
    {
        this.type = type;
        this.sound = sound;
    }

    // 4) Getters
    public String getType ()
    {
        return type;
    }

    public String getSound ()
    {
        return sound;
    }

    // 5) Setters
    public void setType (String type)
    {
        this.type = type;
    }

    public void setSound (String sound)
    {
        this.sound = sound;
    }

    // 3) toString()
    public String toString ()
    {
        String output = "Animal: " + type
                + "\nSound: " + sound;
        return output;
    }

} // end Animal class