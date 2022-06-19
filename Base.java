public class Base {
    // Instance Variables
    String name = " ";
    int health = 0;

    // This is a constructor. It is a special method that is called when an object is created.
    public Base() {
    }

    // This is a constructor. It is a special method that is called when an object is created.
    public Base(int health) {
        this.health = health;
    }

    // This is a getter and setter for the instance variables.
    /**
     * This function returns the health of the base
     * 
     * @return The health of the base.
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * This function sets the health of the base to the value of the parameter health
     * 
     * @param health The amount of health the base has.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * This function returns the name of the base
     * 
     * @return The name of the base.
     */
    public String getName() {
        return this.name;
    }

    /**
     * This function sets the name of the object to the name passed in as a parameter
     * 
     * @param name The name of the parameter.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * If the object is the same as the one being compared to, return true. If the object is not an
     * instance of the class, return false. If the object is an instance of the class, cast it to the
     * class and compare the health values
     * 
     * @param o The object to compare to.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Base)) {
            return false;
        }
        Base base = (Base) o;
        return health == base.health;
    }

    /**
     * The toString() method returns a string representation of the object
     * 
     * @return The health of the player.
     */
    @Override
    public String toString() {
        return "{" +
            " health='" + getHealth() + "'" +
            "}";
    }
}