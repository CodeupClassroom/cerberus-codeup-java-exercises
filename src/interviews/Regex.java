package interviews;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_PATTERN = "foo.bar";
    private static final String FILE_NAME = "data/regex02.txt";

    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile(REGEX_PATTERN);

        Path path = Paths.get(FILE_NAME);
        Files.lines(path).forEach(line -> {
//            System.out.println(line);
            Matcher m = p.matcher(line);
            if(m.find()) {
                System.out.println(line);
            }
        });
    }
}
