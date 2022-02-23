class DriverClass
{
    public static void main(String[] args)
    {

        Cow JgeromeCow = new Cow ("Jgerome", "cow", "moo");
        Pig PeppaPig = new Pig (false, "pig", "oink");

        Chick EggsteinChick = new Chick (true, "old chick", "a");
        Chick EggbertChick = new Chick ("young chick", "peep");

        Animal[] farm = new Animal[4];
        farm[0] = JgeromeCow;
        farm[1] = PeppaPig;
        farm[2] = EggsteinChick;
        farm[3] = EggbertChick;

        Farmer FarmerJohn = new Farmer ("John", 54, "corn", "magenta");
        System.out.println(FarmerJohn.singSong());

        // loop that prints out each animal in farm
    /*
    for (Animal i: farm)
    {
      System.out.println(i + "\n");
    }
    */

    } // end main method

} // end DriverClass class