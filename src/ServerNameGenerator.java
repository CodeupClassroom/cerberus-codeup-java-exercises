public class ServerNameGenerator {

    public static String[] adjectives = {"Awful", "Blushing","Enthusiastic","Lazy","Talented","Strange","Jittery","Successful","Modern","Mysterious"};

    public static String[] nouns = {"dog","cat","bat","frog","human","cow","horse","goat","camel","llama"};


    public static String randElem(String[] words){
         return words[(int)Math.floor(Math.random() * (words.length-1))];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(randElem(adjectives) + " - " + randElem(nouns));
    }
}
