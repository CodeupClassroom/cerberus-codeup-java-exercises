public class StringsLecture {
    public static void main(String[] args) {

        String name = "codeup";
        System.out.println("Hello from " + name + "!");

        //__________________________String Comparison Methods____________________________--


        // Don't do this!
        if ("I am a string" == "I am a string") {
            System.out.println("Strings are equal");
        }

        // Do this instead
        if ("I am a string".equals("I am a string")) {
            System.out.println("Strings are equal");
        }

        String hello = "hello world";

//           equals method
        hello.equals("hello world");
        hello.equals("HELLO WORLD");



//           equalsIgnoreCase method
        hello.equalsIgnoreCase("HELLO WORLD");
        hello.equalsIgnoreCase("hello world");



//           startsWith method
        System.out.println(hello.startsWith("l"));
        System.out.println(hello.startsWith("h"));
        System.out.println(hello.startsWith("hel"));



//            endsWith method
        System.out.println(hello.endsWith("o"));
        System.out.println(hello.endsWith("lo"));
        System.out.println(hello.endsWith("jk"));


//    _____________________________Strings Manipulation Methods_____________________________
        String cerberus = "Cerberus";


//        charAt method
        cerberus.charAt(0);
        cerberus.charAt(3);



//        indexOf method
        cerberus.indexOf("c");
        cerberus.indexOf("ber");

//        lastIndexOf method
        cerberus.lastIndexOf("e");
        cerberus.lastIndexOf("ber");

//        length method
        cerberus.length();

        cerberus.replace('e','z');


    }
}
