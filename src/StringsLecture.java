public class StringsLecture {
    public static void main(String[] args) {

//        String name = "codeup";
//        System.out.println("Hello from " + name + "!");

        //__________________________String Comparison Methods____________________________--


        // Don't do this!
//        if ("I am a string" == "I am a string") {
//            System.out.println("Strings are equal");
//        }

        // Do this instead
//        if ("I am a string".equalsIgnoreCase("i am a string")) {
//            System.out.println("Strings are equal");
//        }

        String hello = "hello world";

//                  equals method

//        System.out.println("equals method");
//        System.out.println(hello.equals("hello world"));
//        System.out.println(hello.equals("HELLO WORLD"));


//                equalsIgnoreCase method

//        System.out.println("equalsIgnoreCase method");
//        System.out.println(hello.equalsIgnoreCase("HELLO WORLD"));
//        System.out.println(hello.equalsIgnoreCase("hello world"));


//                  startsWith method

//        System.out.println("startsWith method");
//        System.out.println(hello.startsWith("l"));
//        System.out.println(hello.startsWith("h"));
//        System.out.println(hello.startsWith("hel"));



//                  endsWith method

//        System.out.println("endsWith method");
//        System.out.println(hello.endsWith("d"));
//        System.out.println(hello.endsWith("rld"));
//        System.out.println(hello.endsWith("jk"));


//    _____________________________Strings Manipulation Methods_____________________________
        String cerberus = "Cerberus";


//                   charAt method

//        System.out.println("charAt method");
//        System.out.println(cerberus.charAt(0));
//        System.out.println(cerberus.charAt(3));


//                   indexOf method

//        System.out.println("indexOf method");
//        System.out.println(cerberus.indexOf("C"));
//        System.out.println(cerberus.indexOf("ber"));


//                 lastIndexOf method

//        System.out.println("lastIndexOf");
//        System.out.println(cerberus.lastIndexOf("e"));
//        System.out.println(cerberus.lastIndexOf("ber"));

//                    length method

//        System.out.println("length method");
//        System.out.println(cerberus.length());


//                  replace method

//        System.out.println("replace method");
//        System.out.println(cerberus.replace('e', 'z'));

        //        substring method

//        System.out.println("substring method");
//        System.out.println(cerberus.substring(2));
        System.out.println(cerberus.substring(2, 4));


//                toUpperCase methdod

//        System.out.println("toUpperCase method");
        String upperCerb = cerberus.toUpperCase();
        System.out.println(upperCerb);

//                    toLowerCase

//        System.out.println("toLowerCase method");
        System.out.println(upperCerb.toLowerCase());

//                     trim method

//        System.out.println("trim method");
        String trimming = "    hello";
        System.out.println(trimming.trim());

        cerberus.indexOf("e");


    }




}
