import jdk.jshell.PersistentSnippet;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person lola = new Person("Lola");
        Person docRob = new Person("Mark");
        Person laura = new Person("Laura");

        Person nPerson = new Person("New Person");

        Person[] people = new Person[3];

        people[0]= lola;
        people[1]= docRob;
        people[2]= laura;

        Person[] people2 = addPerson(people,nPerson);

        for(var i = 0; i< people.length; i++){
            System.out.println(people[i].getName());
        }
        System.out.println("-------------");
        for(var i = 0; i< people2.length; i++){
            System.out.println(people2[i].getName());
        }


    }

    public static Person[] addPerson(Person[] personArr, Person person){
        Person[] nPeople = Arrays.copyOf(personArr, personArr.length+1);
        nPeople[nPeople.length-1] = person;
        return nPeople;
    }
}
