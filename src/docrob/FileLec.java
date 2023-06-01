package docrob;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileLec {
    public static void main(String[] args) {

        // explain relative vs. absolute paths
        // use the terminal below to show this using cat or ls

        // Path objects
        // use Paths.get to get a path ref to dir and a file
        // relative
        // then absolute
        Path myDir = Paths.get("mydir");
//        try {
//            Files.createDirectory(myDir);
//        } catch (IOException e) {
////            System.out.println("ERROR: " + e.getMessage());
//            e.printStackTrace();
//        }

        if(Files.notExists(myDir)) {
            try {
                Files.createDirectory(myDir);

                myDir = Paths.get("mydir/otherdir");
                Files.createDirectory(myDir);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        Path myFile = Paths.get("mydir", "myFile.txt");
//        try {
//            Files.createFile(myFile);
//        } catch (IOException e) {
////            e.printStackTrace();
//        }

        // an alternative to using an if/else to first check if file exists
        // try to create it and ignore an already exists exception


        // do we have to specify all the dirs as separate args???

        // Files class
        // .exists() to see dirs and files that exist and don't exist
        // point at notExists()

        // now try .createDirectory() and .createFile()
        // feel the IOException

        // write to a file using Files.write
        // default for StandardOpenOption is create/overwrite
        // look at other options
//        List<String> fruits = Arrays.asList("apple", "pear", "banana");
//        try {
//            Files.write(myFile, fruits);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Fighter bob = new Fighter("Bob");
        bob.setHealth(55);

        Fighter sue = new Fighter("Sue");
        List<Fighter> fighters = Arrays.asList(bob, sue);
//
        saveFighters(fighters);


        // make a method called saveCombatants()
        // and make a .toFileString() method that it calls for extra nice

        // what are we trying to write to a file?
        // how should we write an object to a text file???

        // read from a file
        // Files.readAllLines
        // Strings are easy... but how do we get other OBJECTS from a file???

        // make a method called loadCombatants
        // and use a static method called .fromFileString(str)
        // explain why that is nice

        fighters = loadFighters();

        // print out the fighters
        for (Fighter fighter : fighters) {
            fighter.printStatus();
        }

    }

    private static void saveFighters(List<Fighter> fighters) {
        try {
            Path dataFile = Paths.get("mydir", "myFile.txt");

            List<String> fileStrings = getFileStringsFromFighters(fighters);

            Files.write(dataFile, fileStrings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Fighter> loadFighters() {
        List<Fighter> fighters = new ArrayList<>();
        try {
            Path dataFile = Paths.get("mydir", "myFile.txt");

            fighters = getFightersFromFile(dataFile);

        } catch (IOException e) {
            System.out.println("Hey man your data file does not exist!");
            System.exit(0);
        }

        return fighters;
    }

    private static List<Fighter> getFightersFromFile(Path dataFile) throws IOException {
        List<String> fighterStrings = Files.readAllLines(dataFile);
        List<Fighter> fighters = new ArrayList<>();

        // iterate over the strings
        for (String fighterString : fighterStrings) {
            // make a new fighter object from each string
            Fighter fighter = Fighter.createFromCSVString(fighterString);

            // add the fighter objects to the fighters list
            fighters.add(fighter);
        }

        return fighters;
    }

    private static List<String> getFileStringsFromFighters(List<Fighter> fighters) {
        // 0. make a new empty list of strings
        List<String> fighterStrings = new ArrayList<>();

        // 1. for each fighter
        for (Fighter fighter : fighters) {
            // 2. get the string version of the fighter
            String fighterString = fighter.toCSVString();

            // 3. add that string to a list of strings
            fighterStrings.add(fighterString);
        }

        // 4. return the list of strings
        return fighterStrings;
    }
}
