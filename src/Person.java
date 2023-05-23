public class Person {
    private String name;


    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name  +"!");
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        Person lola = new Person("Lola");
//        System.out.println(lola.getName());
//        lola.setName("DocRob");
//        System.out.println(lola.getName());
//        lola.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        System.out.println(person1);
        System.out.println(person2);


    }

}
