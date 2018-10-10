package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
//Create an application which will prompt the user to enter the name of their favorite Movie.
//Add the Movie to an array list.  Use a loop to continue adding movies to the array
//until the user presses q or Q.
//Once the user presses Q then print the list of movies before exiting the program.


    public static void main(String[] args) {
	// write your code here

        ArrayList<String> movies = new ArrayList<>();
        String entry="";
        //String movieToWatch="";
        Scanner in = new Scanner(System.in);

        while(!entry.equalsIgnoreCase("q")) {
            System.out.println("Enter a movie");
            entry = in.next();
            if(!entry.equalsIgnoreCase("q")) {
                movies.add(entry);
                Collections.sort(movies);}//Sorts movie
            }for (String s: movies) //enhanced for loop to print out ArrayList Movies

            System.out.println(s);

        Random rand = new Random();
        int index = rand.nextInt(movies.size()-1);//
        // random needs a variable int; array index = size -1
        String movieToWatch = movies.get(index);

        System.out.println("\n You should watch " + movieToWatch);
        }
    }
