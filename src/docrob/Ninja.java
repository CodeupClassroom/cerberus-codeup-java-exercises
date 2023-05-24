package docrob;

public class Ninja extends Fighter {

    public Ninja(String name) {
        super(name);

        // ninja's should start with 60 health
//        this.setHealth(60);
        this.health = 60;
    }
}
