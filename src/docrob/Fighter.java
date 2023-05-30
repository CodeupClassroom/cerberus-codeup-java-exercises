package docrob;

public class Fighter extends ArenaCombatant {
    // data definitions for a fighter in my game
    // fields, instance variables, member variables

    // every fighter has their own name (not static)
    private String name;

    public void taunt() {
        System.out.println("You call that a sword???");
    }

    @Override
    public void attack(ArenaCombatant attackee) {
        // if the attackee can dodge, then check that first
        if(attackee instanceof Dodger) {
            Dodger dodger = (Dodger) attackee;
            if(dodger.dodge()) {
                System.out.println(attackee + " dodges " + this.toString() + "'s attack");
                return;
            }
        }
        attackPower50(attackee);
    }

    public void attackPower50(ArenaCombatant attackee) {
        int damage = (int) (Math.random() * 50 + 1);

        System.out.println(this.getName() + " hits " + attackee + " for " + damage + "!!!");

        attackee.takeDamage(damage);
    }

    @Override
    public String toString() {
        return name;
    }

    public void printStatus() {
        System.out.println(name + " the Fighter has " + health + " health.");
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

}
