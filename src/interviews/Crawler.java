package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Crawler {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL("https://www.google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();

            System.out.println(sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
