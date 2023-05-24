package docrob;

public class InterfaceLec {
    // what is an abstract class

    // make an ArenaCombatant class and explain it
    // it will have Fighters and Wizards and Monsters in it
    // what do ArenaCombatants have in common?
        // maybe just health AND an attack() method

    // now fix up Fighter and test to see if bob and sue can hit each other

    // now make a Goblin subclass of ArenaCombatant
        // don't need name for Goblin
        // and we can define attack in a pretty basic way like doing 20 pts of damage
        // and goblins have maybe 40 health

    // now we have Fighters, Ninjas, and Goblins all fighting each other

    // explain what an interface is
    // interfaces can define special abilities like Dodging
    // let's create an ability (interface) called Dodger
    // and a method call dodges()

    // now implement Dodger for Ninja and Goblin
    // a ninja can dodge 25% of the time
    // a goblin is little and sneaky and can dodge 50% of the time

    // test the dodging methods

    // now let's use dodging in our main()
    // if we KNOW that a class can dodge, then we can call the dodge method
    // to determine if the attack will land

    // NOTE that we can even use Dodger variable to store a reference to a Goblin or Ninja
    //      but NOT a Fighter

    // BUT... how can we make dodging part of the attack? so we can just pass in an ArenaCombatant reference?
    //  ArenaCombatant is an AbstractReference
    //      the attack will have to check the parameter to see if it is a Dodger
        //      reflection

    // lastly, we can use the same concept of abstract references to have an array of combatants
    // we can go through the array and have any 2 fight each other


}
