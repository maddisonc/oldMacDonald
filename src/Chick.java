public class Chick extends Animal
{
    // 1) Instance variables
    public int age; // in weeks

    // 2) Constructor
    // chick is too young
    public Chick (String type, String sound)
    {
        super (type, sound);
        this.age = age;
    }

    // chick is old
    public Chick (boolean old, String type, String sound)
    {
        super (type, sound);
        this.sound = "cheep";
        this.age = age;
    }

    // 4) Getters
    public int getAge ()
    {
        return age;
    }

    // 5) Setters
    public void setAge (int age)
    {
        this.age = age;
    }

    // 6) Brain
    // create method that checks age to determine sound
    //@Overide
    public String ageSound ()
    {
        String ageSound = "";

        if (age < 2)
        {
            ageSound = "peep";
        }

        else
        {
            ageSound = "cheep";
        }

        return ageSound;
    }

    // 3) toString()

} // end Chick class