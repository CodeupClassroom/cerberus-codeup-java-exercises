package docrob;

public class Fighter {
    // data definitions for a fighter in my game
    // fields, instance variables, member variables

    // every fighter has their own name (not static)
    private String name;

    // every fighter has their own health value
    private int health;

    public void attackPower50(Fighter fighterGettingHit) {
        int damage = (int) (Math.random() * 50 + 1);

        System.out.println(this.getName() + " hits " + fighterGettingHit.getName() + " for " + damage + "!!!");

        int currentHealth = fighterGettingHit.getHealth();
        currentHealth -= damage;
        fighterGettingHit.setHealth(currentHealth);
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    // constructors
    public Fighter() {
        this.name = "Unknown fighter";
        this.health = 100;
    }

    public Fighter(String name) {
        this.name = name;
        health = 100;
    }

    // accessor (getters and setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static void main(String[] args) {
        System.out.println("run some code to test out a fighter here if necessary");
    }
}
