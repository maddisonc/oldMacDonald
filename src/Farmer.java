public class Farmer
{
    // 1) Instance variables
    String farmerName;
    int farmerAge;
    String favCrop;
    String tractorColor;

    // 2) Constructor
    public Farmer (String farmerName, int farmerAge, String favCrop, String tractorColor)
    {
        this.farmerName = farmerName;
        this.farmerAge = farmerAge;
        this.favCrop = favCrop;
        this.tractorColor = tractorColor;
    }

    // 4) Getters
    public String getFarmerName ()
    {
        return farmerName;
    }

    public int getFarmerAge ()
    {
        return farmerAge;
    }

    public String getFavCrop ()
    {
        return favCrop;
    }

    public String getTractorColor ()
    {
        return tractorColor;
    }

    // 5) Setters
    public void setFarmerName (String farmerName)
    {
        this.farmerName = farmerName;
    }

    public void setFarmerAge (int farmerAge)
    {
        this.farmerAge = farmerAge;
    }

    public void setFavCrop ()
    {
        this.favCrop = favCrop;
    }

    public void setTractorColor ()
    {
        this.tractorColor = tractorColor;
    }

    // 6) Brains
    public String singSong ()
    {
        String lyrics = "Old MacDonald had a farm, Ee i ee i oh!"
                + "\nAnd on that farm he had some chickens,"
                + "\nEe i ee i oh!"
                + "\nWith a cluck-cluck here,"
                + "\nAnd a cluck-cluck there"
                + "\nHere a cluck, there a cluck,"
                + "\nEverywhere a cluck-cluck"
                + "\nOld MacDonald had a farm"
                + "\nEe i ee i oh!\n"

                + "\nOld MacDonald had a farm,"
                + "\nEe i ee i oh!"
                // + "\nAnd on that farm he had a cow named " + cow.name 
                + "\nEe i ee i oh! With a moo-moo here,"
                + "\nAnd a moo-moo there"
                + "\nHere a moo, there a moo,"
                + "\nEverywhere a moo-ooo"
                + "\nOld MacDonald had a farm,"
                + "\nEe i ee i oh!"

                + "\nOld MacDonald had a farm,"
                + "\nEe i ee i oh!"
                + "\nAnd on that farm he had some pigs,"
                + "\nEe i ee i oh! With an oink-oink here,"
                + "\nAnd an oink-oink there"
                + "\nHere an oink, there an oink,"
                + "\nEverywhere an oink-oink"
                + "\nOld MacDonald had a farm,"
                + "\nEe i ee i oh!";
        return lyrics;
    }

    // 3) toString()
    public String toString()
    {
        String output = "Farmer name: " + farmerName
                + "Farmer age: "+ farmerAge
                + "Favorite crop: " + favCrop
                + "Tractor color: " + tractorColor;
        return output;
    }

} // end Farmer class
