package docrob;

import java.util.*;

public class CollectionsLec {
    public static void main(String[] args) {

        // explain Collections
        // Lists, Sets, Maps

        // ************* ARRAYLIST

        // explain ArrayList

        // declare an ArrayList
        // explain <String>
        // add a few elements
        // try to add something not String
        ArrayList<String> fruits;
        fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");

        // print an arraylist
        System.out.println(fruits);


        // can also give it any # of string args
        fruits = new ArrayList<>(Arrays.asList("guava", "peach"));
        System.out.println(fruits);

        // use ArrayList initializer
        // explain Arrays.asList function

        // show size() instead of .length
        System.out.println(fruits.size());

        // add another element
        fruits.add("banana");

        // print size()
        System.out.println(fruits.size());

        // get an element at a given index
        fruits.add(1, "apple");
        System.out.println(fruits);

        fruits.addAll(Arrays.asList("plum", "apple", "papaya", "durian"));
        System.out.println(fruits);

        // show loops with ArrayList

        // for i
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("the fruit at index %d is %s\n", i, fruits.get(i));
        }


        // foreach
        int i = 0;
        for (String fruit : fruits) {
            fruit = "starfruit";
            System.out.printf("the fruit at index %d is %s\n", i, fruit);
            i++;
        }

        System.out.println(fruits);

        // what happens if you change the food variable's value? does it change the arraylist?


        // show .indexOf()
        // is indexOf() overloaded ?
        // show .lastIndexOf()
        // is there a .contains() ?
        System.out.println(fruits.indexOf("apple"));
        // no good way to find the 2nd occurrence of apple
        System.out.println(fruits.lastIndexOf("apple"));

        System.out.println(fruits.contains("apple"));

        System.out.println("REMOVING FRUITS!");

//        System.out.println(fruits.remove(1));
//        System.out.println(fruits);
//        System.out.println(fruits.remove("apple"));
//        System.out.println(fruits);
//        System.out.println(fruits.remove("apple"));
//        System.out.println(fruits);


        // show .remove()
//        foods.remove("cake");
//        foods.removeAll(Arrays.asList("apple", "cake"));
        System.out.println(fruits.removeAll(Arrays.asList("apple", "cake")));
        System.out.println(fruits);

        // show .removeAll (will need Arrays.asList() )


        // show isEmpty()
        System.out.printf("still have fruits? %b\n", fruits.isEmpty());
        fruits.clear();
        System.out.printf("still have fruits? %b\n", fruits.isEmpty());

        // SHOW AN EXAMPLE OF A CLASS WITH AN ARRAYLIST INSIDE IT
        // create an Arena class
        // start with an array of fighters.
        // remind them about ENCAPSULATION
        // what happens if we directly use the Arena's public array
        // and then later change our mind to use an ArrayList?
        // now use accessor for returning an array of items
        Arena arena = new Arena();
//        arena.roster[0] = new Fighter("Bob");
        arena.addCombatant(new Fighter("Bob"));
        arena.startFight();
        // what supporting methods are handy for working with the Arena's fighters?


        // ************* HASHMAP

        // explain hashmap
        // terms: key value
        // use diagram of file cabinet

        // show hashmap
        HashMap<String, ArenaCombatant> roster = new HashMap<>();

        // first arg is key data type, 2nd arg is value data type
        HashMap<String, String> fruitsMap = new HashMap<>();

        // use a roster of Fighters for the hashmap

        // show .put()
        roster.put("bob", new Fighter("Bob"));
        roster.put("sue", new Fighter("Sue"));

        // print hashmap
        System.out.println(roster);

        // does it overwrite or duplicate if we put again?
//        roster.put("bob", new Goblin());
//        System.out.println(roster);

        // show putIfAbsent
        roster.putIfAbsent("Bob", new Goblin());
        System.out.println(roster);

        // show .get()
        System.out.println(roster.get("sue"));

        // show get if key is absent
        System.out.println(roster.get("Sue"));

        // show .getOrDefault()
        System.out.println(roster.getOrDefault("Sue", new Fighter("Practice dummy")));


        // show .containsKey
        System.out.println(roster.containsKey("bob"));
        System.out.println(roster.containsKey("Sue"));

        // show .containsValue
        // may need to define .equals() for this
        System.out.println(roster.containsValue(new Fighter("Bob")));

        // show .replace with 2 and 3 args
//        System.out.println(roster.replace("bob", new Goblin()));

        // print hashmap

        // show .remove()
        roster.remove("Bob");
        System.out.println(roster);

        // what if we try to remove a key that is not there?
        System.out.println(roster.remove("asasd"));

        // print hashmap
//        System.out.println(roster);

        // show .isEmpty()
//        System.out.println(roster.isEmpty());

        // show .clear()
//        roster.clear();
//        System.out.println(roster.isEmpty());

        // print hashmap

        // show how to iterate over a hashmap
        // use .keySet()
        // and foreach over the set with a .get()

        Set<String> keys = roster.keySet();
        for (String key : keys) {
            System.out.println(roster.get(key));
        }


        // ************* SET

        // make a HashSet
        HashSet<String> fruitSet = new HashSet<>();


        // add a few elements
        fruitSet.add("apple");
        fruitSet.add("banana");
        // print the set
        System.out.println(fruitSet);
        
        // add a duplicate
        fruitSet.add("apple");

        // print the set
        System.out.println(fruitSet);
        
        // iterate over the set
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }

        // look thru other methods

    }
}
