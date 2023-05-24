package docrob;

public class Ninja extends Fighter {
    private int numShuriken = 3;

    public void throwShuriken(Fighter target) {
        // can only throw 3 shuriken at a time. return if < 3
        if(numShuriken < 3) {
            System.out.println(this.getName() + " has no more shuriken! :(");
            return;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName() + " throws a shuriken at " + target.getName() + "!");
            int currentHealth = target.getHealth();
            currentHealth -= 20;
            target.setHealth(currentHealth);

            numShuriken--;
        }
    }

    @Override
    public void taunt() {
        System.out.println("The ninja stares at you.");
//        super.taunt();
    }

    @Override
    public String toString() {
        return getName() + " the NINJA has " + health + " health with " + numShuriken + " shuriken.";
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
