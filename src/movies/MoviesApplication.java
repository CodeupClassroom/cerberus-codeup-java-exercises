package movies;

import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static Movie[] mlist = findAll();
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Hello, welcome to my movie application!");
        int choice = -1;
        while(choice != 0) {
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - add new movie");

            System.out.println("Enter your choice: ");

            choice = in.getInt(0, 6);

            doChoice(choice);

        }


//        Your application should continue to run until the user chooses to exit.


    }

    private static void doChoice(int choice){
        switch (choice){
            case 1:
                for(Movie pMovie : mlist){
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                }
                break;
            case 2:
                for(Movie pMovie : mlist){
                    if(pMovie.getCategory().equals("animated")){
                        System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                    }
                }
                break;

            case 3:
                for(Movie pMovie : mlist){
                    if(pMovie.getCategory().equals("drama")){
                        System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                    }
                }
                break;
            case 4:
                for(Movie pMovie : mlist){
                    if(pMovie.getCategory().equals("horror")){
                        System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                    }
                }
                break;
            case 5:
                for(Movie pMovie : mlist){
                    if(pMovie.getCategory().equals("scifi")){
                        System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                    }
                }
                break;
            case 6:
                Input in = new Input();
                System.out.println("Enter new movies name: ");
                String name = in.getString();
                System.out.println("Enter new movies category: ");
                String category = in.getString();
                Movie nMovie = new Movie(name,category);
                mlist = addMovie(mlist,nMovie);

                for(Movie pMovie : mlist){
                    System.out.println(pMovie.getName() + " -- " + pMovie.getCategory());
                }

        }
    }

    public static Movie[] addMovie(Movie[] movieArr, Movie movie){
        Movie[] nMovie = Arrays.copyOf(movieArr, movieArr.length+1);
        nMovie[nMovie.length-1] = movie;
        return nMovie;
    }
}
