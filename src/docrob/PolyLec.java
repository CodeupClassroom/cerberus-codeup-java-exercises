package docrob;


public class PolyLec {
    public static void main(String[] args) {

        // review the Fighter class

        // make the toString() method nicer
        Fighter bob = new Fighter("Bob");
        Fighter sue = new Fighter("Sue");

        // make a new method for Fighters called taunt()

        // what if Sue is ACTUALLY a Ninja???
        // a ninja IS A fighter BUT is a little different.
        //      has ninja taunt
        //      less health
        //      and a ninja-specific attack

        // show an alternate approach using a field. ick!

        // explain inheritance and why it is awesome
        // make a subclass/subtype of Fighter (ninja)

        // make a single arg constructor
        // notice that it is calling the Fighter single arg constructor, which is fine
        // but... we want to set health lower

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
        // https://en.wikipedia.org/wiki/Polymorphism_(computer_science)


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