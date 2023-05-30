package docrob;

public class Ninja extends Fighter implements Dodger {
    private int numShuriken = 3;

    @Override
    public boolean dodge() {
        // ninja can dodge 25% of the time
        return Math.random() < .25;
    }

    public void throwShuriken(ArenaCombatant target) {
        // can only throw 3 shuriken at a time. return if < 3
        if(numShuriken < 3) {
            System.out.println(this.getName() + " has no more shuriken! :(");
            return;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName() + " throws a shuriken at " + target.toString() + "!");
            target.takeDamage(20);

            numShuriken--;
        }
    }

    @Override
    public void taunt() {
        System.out.println("The ninja stares at you.");
//        super.taunt();
    }

    @Override
    public void printStatus() {
        System.out.println(getName() + " the NINJA has " + health + " health with " + numShuriken + " shuriken.");
    }

    public Ninja(String name) {
        super(name);

        // ninja's should start with 60 health
//        this.setHealth(60);
        this.health = 60;
    }

    // accessors

    public int getNumShuriken() {
        return numShuriken;
    }

    public void setNumShuriken(int numShuriken) {
        this.numShuriken = numShuriken;
    }
}
