public class Hamster extends myPets
{
    //1 Instance variables
        private boolean needToEx; //Do I need to exercise it
        private boolean needsGrooming; //Long hair vs short hair

    //2 Constructors
        public Hamster(boolean needsToEx, boolean needsGrooming, boolean isFriendly, String foodType, double amtSleep, String name)
        {
            super(isFriendly, foodType, amtSleep, name);
            this.needToEx = needsToEx;
            this.needsGrooming = needsGrooming;
        }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                        "\nNeeds to exercise: " + needToEx +
                        "\nNeeds to be groomed: " + needsGrooming;
        return  output;
    }

}