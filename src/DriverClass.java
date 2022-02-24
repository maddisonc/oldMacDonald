class DriverClass
{
    public static void main(String[] args)
    {
        // Instantiate farm animals
        Cow JgeromeCow = new Cow ("Jgerome", "cow", "moo");
        Pig PeppaPig = new Pig (false, "pig", "oink");

        Chick EggsteinChick = new Chick ("chick", 2); // chicks that are 2 weeks or older can say "cheep"
        Chick EggbertChick = new Chick ("chick", 1); // younger chicks can only say "peep"

        // Array of farm animals
        Animal[] farm = new Animal[4];
        farm[0] = JgeromeCow;
        farm[1] = PeppaPig;
        farm[2] = EggsteinChick;
        farm[3] = EggbertChick;

        // Instantiate farmer (singer)
        Farmer FarmerJohn = new Farmer ("John", 54, "corn", "magenta");

        // Print out song and pass in cow's name, chicks' sounds based on age, and pig status
        //System.out.println(FarmerJohn.singSong(JgeromeCow.getName(), EggsteinChick.ageSound(), EggbertChick.ageSound(), PeppaPig.getIsGPig()));

        System.out.println(FarmerJohn.verse("green", JgeromeCow.getName(), JgeromeCow.getType(), JgeromeCow.getSound()));
        System.out.println(FarmerJohn.verse("cyan", PeppaPig.getType(), PeppaPig.getSound()));
        System.out.println(FarmerJohn.verse("yellow", EggsteinChick.getType(), EggsteinChick.ageSound()));
        System.out.println(FarmerJohn.verse("yellow", EggbertChick.getType(), EggbertChick.ageSound()));
        System.out.println("_______________________________________________________________"); // line separator

        // Print out farmer's dating profile
        System.out.println("\nWelcome to FarmersOnly.com!  Here is a potential match:");
        System.out.println("\n" + FarmerJohn.toString());

    } // end main method

} // end DriverClass class