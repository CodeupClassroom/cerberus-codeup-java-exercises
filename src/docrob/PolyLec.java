package docrob;


public class PolyLec {
    public static void main(String[] args) {

        // make a new method for Fighters called taunt()

        // what if Sue is ACTUALLY a Ninja???
        // a ninja IS A fighter but is a little different.
        //      e.g., has ninja taunt, less health, and a ninja-specific attack
        // explain inheritance and why it is awesome
        // make a subclass/subtype of Fighter (ninja)

        // make a single arg constructor
        // notice that it is calling the Fighter single arg constructor, which is ok but...
        // we want to set health lower

        // show setting health lower in the ninja constructor
        // using a setter in the subclass is kind of silly
        // protected vs. private

        // explain superclass/supertype

        // show reuse/inheriting with attack()

        // and overriding with the ninja definition of taunt()

        // what happens when we print out sue???
            // can we override toString()?

        // and add a ninja specific attack too! throwShuriken()

        // define a ninja-specific property
        //  that affect the ninja-cool attack
        //  and add a getter/setter  numShuriken


        // what if the ninja wants to do both kinds of taunts?
        // show super.taunt()

        // polymorphism
        // go beyond the lesson's definition
        // point to solid principles reference
        // https://en.wikipedia.org/wiki/SOLID


        // now let's use abstract references to store fighters and ninjas together!
        // pros and cons
        // can store any fighter or its subclass
        // but can only treat them as Fighters unless you cast the reference

        // show reflection though using instanceof !!!

        // final
        // class (cannot extend)
        // property (assign only once)
        // method (cannot override)
    }
}