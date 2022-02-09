public class Frog extends myPets
{
    //1 instance variables
        private boolean isPoisonous;
    //2 constructors
        public Frog(boolean isPoisonous, boolean isFriendly, String foodType, double amtSleep, String name)
        {
            super (isFriendly, foodType, amtSleep, name);
            this.isPoisonous = isPoisonous;
        }
    //3 toString
        public String tostring()
        {
            String output = super.toString() +
                            "\nIs Poisonous: " + isPoisonous;
            return output;
        }

}//end child class