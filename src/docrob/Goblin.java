package docrob;

public class Goblin extends ArenaCombatant implements Dodger {

    @Override
    public boolean dodge() {
        // goblins can dodge 50% of the time
        return Math.random() < .5;
    }

    @Override
    public void attack(ArenaCombatant attackee) {
        System.out.println("Goblin attacks " + attackee + " for 20 damage.");
        attackee.takeDamage(20);
    }

    public Goblin() {
        this.health = 40;
    }

    @Override
    public String toString() {
        return "Goblin";
    }

    public void printStatus() {
        System.out.println("Goblin has " + health + " health.");
    }

}
