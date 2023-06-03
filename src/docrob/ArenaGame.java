package docrob;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArenaGame {
    public static void main(String[] args) {

        // 1. load fighters from a file
        List<Fighter> fighters = loadFighters();
        System.out.println(fighters);

        // 2. pick 2 fighters to fight
        // 3. have them hit each other
        // have first fighter hit second fighter
        fighters.get(0).attack(fighters.get(1));

        // 4. save fighters back to file
        saveFighters(fighters);
    }

    private static void saveFighters(List<Fighter> fighters) {
        List<String> strings = new ArrayList<>();

        // 1. iterate over the fighters list
        for (Fighter fighter : fighters) {
            // 2. for each fighter, make a string from the fighters data
            String string = fighter.getName();
            string += "," + fighter.getHealth();

            // 3. add that string to a list of strings
            strings.add(string);
        }

        // 4. make a path object to the data file
        Path dataFile = Paths.get("mydir/otherdir", "myFile.txt");

        // 5. write the list of strings to the file
        try {
            Files.write(dataFile, strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Fighter> loadFighters() {
        List<Fighter> fighters = new ArrayList<>();

        try {
            // 1. get a path object to the file
            Path dataFile = Paths.get("mydir/otherdir", "myFile.txt");

            // 2. read all the fighter data from the file as strings
            List<String> strings = Files.readAllLines(dataFile);

            // 3. iterate over the strings
            for (String string : strings) {
                // 4. for each fighter string from the file, make a fighter object from it and add it to the list of fighters
                String [] stringParts = string.split(",");

                Fighter fighter = new Fighter(stringParts[0]);
                fighter.setHealth(Integer.parseInt(stringParts[1]));

                fighters.add(fighter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. return the list of fighters
        return fighters;
    }
}
