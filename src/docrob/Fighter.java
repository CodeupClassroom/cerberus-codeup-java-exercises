package docrob;

public class Fighter {
    // data definitions for a fighter in my game
    // fields, instance variables, member variables

    // every fighter has their own name (not static)
    private String name;

    // every fighter has their own health value
    protected int health;

    public void taunt() {
        System.out.println("You call that a sword???");
    }

    public void attackPower50(Fighter fighterGettingHit) {
        int damage = (int) (Math.random() * 50 + 1);

        System.out.println(this.getName() + " hits " + fighterGettingHit.getName() + " for " + damage + "!!!");

        int currentHealth = fighterGettingHit.getHealth();
        currentHealth -= damage;
        fighterGettingHit.setHealth(currentHealth);
    }

    @Override
    public String toString() {
        return name + " the Fighter has " + health + " health.";
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


}
