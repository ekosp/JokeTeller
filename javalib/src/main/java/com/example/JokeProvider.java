package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JokeProvider {

    private ArrayList<String> jokes;

    /*
    list joke get from http://www.short-funny.com/ at 30th Nov 2017
    Funniest jokes, quotes and sayings: The best jokes | Top 100

    */
    public JokeProvider() {
        this.jokes = new ArrayList<>();
        jokes.add("Q: Can a kangaroo jump higher than a house?\n" +
                "-\n"+
                "A: Of course, a house doesn't jump at all.");

        jokes.add("Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                "-\n"+
                "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n"+
                "-\n"+
                "Doctor: \"Nine.\"");

        jokes.add("Anton, do you think I'm a bad mother?\n"+
                "-\n"+
                "My name is Paul.");

        jokes.add("What is the difference between a snowman and a snowwoman?\n"+
                "-\n"+
                "Snowballs.");

        jokes.add("My dog used to chase people on a bike a lot. \n" +
                "It got so bad, finally I had to take his bike away.");

        jokes.add("Sleep with an open window tonight!\n" +
                "1400 mosquitos like that. 420 mosquitos commented on it. 210 mosquitos shared this.\n" +
                "One mosquito invited for the event. 2800 mosquitos will be attending the event.");

        jokes.add("\"My wife suffers from a drinking problem.\"\n" +
                "-\n" +
                "\"Oh is she an alcoholic?\"\n" +
                "-\n" +
                "\"No, I am, but she's the one who suffers.\"");

        jokes.add("Doctor: \"Do you do sports?\"\n" +
                "-\n" +
                "Patient: \"Does sex count?\"\n" +
                "-\n" +
                "Doctor: \"Yes.\"\n" +
                "-\n" +
                "Patient: \"Then no.\"");

        jokes.add("Patient: Oh doctor, I'm just so nervous. This is my first operation.\n" +
                "-\n" +
                "Doctor: Don't worry. Mine too.");

        jokes.add("A naked women robbed a bank. Nobody could remember her face.");

        jokes.add("Why is women's soccer so rare?\n" +
                "-\n" +
                "It's quite hard to find enough women willing to wear the same outfit.");
    }

    //get random joke
    public String tellJoke() {
        Random random = new Random();
        int i = random.nextInt(jokes.size());
        return jokes.get(i);
    }
}
