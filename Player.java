public class Player {
    // Instance Variables
    String name = " ";
    int money = 0;


    // This is a constructor.
    public Player() {
    }

    // This is a constructor.
    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // This is a getter and setter for the instance variables.
    /**
     * This function returns the name of the person
     * 
     * @return The name of the person.
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
     * This function returns the money of the player
     * 
     * @return The money variable is being returned.
     */
    public int getMoney() {
        return this.money;
    }

    /**
     * This function sets the money of the player to the money passed in
     * 
     * @param money The amount of money the player has.
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * This function sets the money of the player and returns the player.
     * 
     * @param money The amount of money the player has.
     * @return The object itself.
     */
    public Player money(int money) {
        setMoney(money);
        return this;
    }

    /**
     * If the object is the same object, return true. If the object is not an instance of the same
     * class, return false. If the object is an instance of the same class, compare the fields and
     * return true if they are equal
     * 
     * @param o The object to compare to.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(name, player.name) && money == player.money;
    }

   /**
    * The toString() method returns a string representation of the object
    */
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", money='" + getMoney() + "'" +
            "}";
    }

}