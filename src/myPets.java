public class myPets
{
    //1 Instance variables
        public boolean isFriendly;
        public String foodType;
        public double amtSleep;
        public String name;

    //constructors
        public myPets(boolean isFriendly, String foodType, double amtSleep, String name)
        {
            this.isFriendly = isFriendly;
            this.foodType = foodType;
            this.amtSleep = amtSleep;
            this.name = name;
        }

    //toString
        public String toString()
        {
            String output = "Name: " + name +
                            "\nFriendly: " + isFriendly +
                            "\nHours of sleep: " + amtSleep +
                            "\nFood type: " + foodType;
            return output;
        }
}
