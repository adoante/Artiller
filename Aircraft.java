public class Aircraft extends Enemy {
    // Instance Variables
    double height = 0.0;

    // This is a constructor. It is a special method that is called when an object is created from a
    // class.
    public Aircraft() {
    }

    // This is a constructor. It is a special method that is called when an object is created from a
    // class.
    public Aircraft(int health, double speed, int damage, int payout, double height) {
        super(health, speed, damage, payout);
        this.height = height;
    }    

    // This is a getter and setter for the height variable.
    /**
     * // Java
     * public double getHeight() {
     *         return this.height;
     *     }
     * 
     * @return The height of the rectangle.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * This function sets the height of the rectangle
     * 
     * @param height The height of the rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * If the object is the same as the one being compared, return true. If the object is not an
     * instance of the class, return false. If the object is an instance of the class, cast it to the
     * class and compare the fields
     * 
     * @param o The object to compare to.
     * @return true false
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aircraft)) {
            return false;
        }
        Aircraft aircraft = (Aircraft) o;
        return height == aircraft.height;
    }

    /**
     * The toString() function returns a string representation of the object
     * 
     * @return The toString method is being returned.
     */
    @Override
    public String toString() {
        return "{" +
            " health='" + getHealth() + "'" +
            ", speed='" + getSpeed() + "'" +
            ", damage='" + getDamage() + "'" +
            ", payout='" + getpayout() + "'" +
            ", height='" + getHeight() + "'" +
            "}";
    }

    
}