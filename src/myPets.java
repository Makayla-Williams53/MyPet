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

    //4 Getters
        public boolean getIsFriendly()
        {
            return isFriendly;
        }

        public String getFoodType()
        {
            return foodType;
        }

        public double getAmtSleep()
        {
            return amtSleep;
        }

        public String getName() {
            return name;
        }

    //5 setters
        public void setFriendly(boolean isFriendly)
        {
            this.isFriendly = isFriendly;
        }

        public void setAmtSleep(double amtSleep)
        {
            this.amtSleep = amtSleep;
        }

        public void setFoodType(String foodType)
        {
            this.foodType = foodType;
        }

        public void setName(String name)
        {
            this.name = name;
        }

    //3 toString
        public String toString()
        {
            String output = "Name: " + name +
                            "\nFriendly: " + isFriendly +
                            "\nHours of sleep: " + amtSleep +
                            "\nFood type: " + foodType;
            return output;
        }
}
