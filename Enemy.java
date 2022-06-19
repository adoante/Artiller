public class Enemy {
    // Instance Variables
    private int health = 0;
    private double speed = 0.0;
    private int damage = 0;
    private int money = 0;

    // This is a empty constructor. It is a special method that is called when an object is created.
    public Enemy() {
    }

    // This is a constructor. It is a special method that is called when an object is created.
    public Enemy(int health, double speed, int damage, int money) {
        this.health = health;
        this.speed = speed;
        this.damage = damage;
        this.money = money;
    }

    // This is a getter and setter for the instance variables.
    /**
     * This function returns the health of the Enemy.
     * 
     * @return The health of the Enemy.
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * This function sets the health of the Enemy to the value of the parameter health.
     * 
     * @param health The amount of health the Enemy has.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * This function returns the speed of the Enemy.
     * 
     * @return The speed of the Enemy.
     */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * This function sets the speed of the Enemy to the value of the speed parameter.
     * 
     * @param speed The speed of the Enemy in meters per second.
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * This function returns the damage of the Enemy.
     * 
     * @return The damage of the Enemy.
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * This function sets the damage of the Enemy to the value of the damage parameter.
     * 
     * @param damage The amount of damage the Enemy does.
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * This function returns the value of the money variable.
     * 
     * @return The money variable is being returned.
     */
    public int getMoney() {
        return this.money;
    }

    /**
     * This function sets the money variable to the value of the money parameter.
     * 
     * @param money The amount of money the Enemy gives.
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * If the object passed in is not an instance of Enemy, return false. Otherwise, compare the fields
     * of the two objects
     * 
     * @param o The object to compare to.
     * @return The hashCode of the object.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Enemy)) {
            return false;
        }
        Enemy enemy = (Enemy) o;
        return health == enemy.health && speed == enemy.speed && damage == enemy.damage && money == enemy.money;
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
            ", money='" + getMoney() + "'" +
            "}";
    }
}