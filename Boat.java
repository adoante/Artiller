public class Boat extends Enemy {
    // Instance Variables
    String size = " ";

    // A constructor.
    public Boat() {
    }

   // A constructor.
    public Boat(String size) {
        this.size = size;
    }

    /**
     * This function returns the size of the boat
     * 
     * @return The size of the boat.
     */
    public String getSize() {
        return this.size;
    }

    /**
     * This function sets the size of the boat
     * 
     * @param size The size of the boat to be returned.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * If the object is the same as the one being compared to, return true. If the object is not an
     * instance of the class, return false. If the object is an instance of the class, compare the size
     * of the object to the size of the object being compared to. If the sizes are equal, return true.
     * If the sizes are not equal, return false
     * 
     * @param o The object to compare with
     * @return The size of the boat.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Boat)) {
            return false;
        }
        Boat boat = (Boat) o;
        return Objects.equals(size, boat.size);
    }

    /**
     * The toString() method returns a string representation of the object
     * 
     * @return The size of the boat.
     */
    @Override
    public String toString() {
        return "{" +
            " size='" + getSize() + "'" +
            "}";
    }
}