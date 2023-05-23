import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, I'm Bob the lackadaisical teenager.");
        String answer;
        do{
            System.out.println("Interact with me!(Please punctuate)");
            String userInput = sc.nextLine();


            if(userInput.endsWith("?")){
                System.out.println("Sure");
            }else if(userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(userInput.equals("")){
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to continue?(y/n)");
            answer = sc.next();
            sc.nextLine();

        }while(answer.equalsIgnoreCase("y"));
    }
}
