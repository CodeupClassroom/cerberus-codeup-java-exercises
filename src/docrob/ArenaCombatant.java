package docrob;

public abstract class ArenaCombatant implements Comparable {
    protected int health;

    public abstract void attack(ArenaCombatant attackee);
    public abstract void printStatus();

    @Override
    public int compareTo(Object o) {
        ArenaCombatant otherCombatant = (ArenaCombatant) o;
        // compare based on health
        if(this.health < otherCombatant.health) {
            return -1; // combatant with lower health comes first
        } else if(this.health > otherCombatant.health) {
            return 1; // combatant with higher health comes after
        } else {
            return 0; // the 2 combatants have the same health
        }
    }



    public void takeDamage(int damage) {
        health -= damage;
        if(health < 0) {
            health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
