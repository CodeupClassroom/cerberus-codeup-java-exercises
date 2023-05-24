package movies;

import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static final int EXIT_APP = 0;
    public static final int INVALID_CHOICE = -1;

    public static Movie[] mlist = findAll();

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Hello, welcome to my movie application!");
        int choice = INVALID_CHOICE;
        while(choice != EXIT_APP) {
            printMenu();

            choice = in.getInt(0, 6);

            doChoice(choice);

        }
//        Your application should continue to run until the user chooses to exit.

    }

    private static void printMenu() {
        System.out.println("What would you like to do?");
        System.out.println("");

        System.out.println("""
0 - exit
1 - view all movies
2 - view movies in the animated category
3 - view movies in the drama category
4 - view movies in the horror category
5 - view movies in the sci-fi category
6 - add new movie

Enter your choice: """);
    }

    private static void doChoice(int choice){
        switch (choice) {
            case 1 -> printMovies("all");
            case 2 -> printMovies("animated");
            case 3 -> printMovies("drama");
            case 4 -> printMovies("horror");
            case 5 -> printMovies("scifi");
            case 6 -> {
                Movie movie = getNewMovieFromUser();
                mlist = addMovie(mlist, movie);
                printMovies("all");
            }
        }
    }

    public static void printMovies(String category) {
        for(Movie pMovie : mlist){
            if(pMovie.getCategory().equals(category) || category.equalsIgnoreCase("all")){
                System.out.println(pMovie);
            }
        }
    }

    private static Movie getNewMovieFromUser() {
        Input in = new Input();
        System.out.println("Enter new movies name: ");
        String name = in.getString();
        System.out.println("Enter new movies category: ");
        String category = in.getString();
        Movie nMovie = new Movie(name,category);
        return nMovie;
    }

    public static Movie[] addMovie(Movie[] movieArr, Movie movie){
        Movie[] nMovie = Arrays.copyOf(movieArr, movieArr.length+1);
        nMovie[nMovie.length-1] = movie;
        return nMovie;
    }
}
