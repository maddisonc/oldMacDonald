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
    public String singSong (String cowName, String chick1Sound, String chick2Sound, boolean isGpig)
    {
        // for colors
        String ANSI_RESET = "\u001B[0m"; //black
        String ANSI_YELLOW = "\u001B[33m"; // yellow
        String ANSI_GREEN = "\u001B[32m"; // green
        String ANSI_CYAN = "\u001B[36m"; // cyan

        String lyrics = "Old MacDonald had a farm, Ee i ee i oh!"
                + "\nAnd on that farm he had some chicks,"
                + "\nEe i ee i oh!"
                + "\nWith a " + ANSI_YELLOW + chick1Sound + ANSI_RESET + "-" + ANSI_YELLOW + chick1Sound + ANSI_RESET + " here,"
                + "\nAnd a " + ANSI_YELLOW + chick2Sound + ANSI_RESET + "-" + ANSI_YELLOW + chick2Sound + ANSI_RESET + " there,"
                + "\nHere a " + ANSI_YELLOW + chick1Sound + ANSI_RESET + ", there a " + ANSI_YELLOW + chick2Sound + ANSI_RESET + ","
                + "\nEverywhere a " + ANSI_YELLOW + chick1Sound + ANSI_RESET + "-" + ANSI_YELLOW + chick2Sound + ANSI_RESET + ","
                + "\nOld MacDonald had a farm"
                + "\nEe i ee i oh!\n"

                + "\nOld MacDonald had a farm,"
                + "\nEe i ee i oh!"
                + "\nAnd on that farm he had a cow named " + ANSI_GREEN + cowName + ANSI_RESET + "," // cow that responds to name
                + "\nEe i ee i oh! With a moo-moo here,"
                + "\nAnd a moo-moo there"
                + "\nHere a moo, there a moo,"
                + "\nEverywhere a moo-ooo"
                + "\nOld MacDonald had a farm,"
                + "\nEe i ee i oh!\n"

                + "\nOld MacDonald had a farm,"
                + "\nEe i ee i oh!"
                + "\nAnd on that farm he had some pigs " + ANSI_CYAN + "(Guinea pig status: " + isGpig + ")" + ANSI_RESET + ","
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
        String output = "Name: " + farmerName
                + "\nAge: "+ farmerAge
                + "\nFavorite crop: " + favCrop
                + "\nTractor color: " + tractorColor;
        return output;
    }

} // end Farmer class
