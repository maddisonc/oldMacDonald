public class Pig extends Animal
{
    // 1) Instance variables
    public boolean isGPig; // pigs is pigs

    // 2) Constructor
    public Pig (boolean isGPig, String type, String sound)
    {
        super (type, sound);
        this.isGPig = isGPig;
    }

    // 4) Getter
    public boolean getIsGPig ()
    {
        return isGPig;
    }

    // 5) Setter
    public void setIsGPig ()
    {
        this.isGPig = isGPig;
    }

    // 3) toString

} // end Pig class