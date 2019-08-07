package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what's your name?");
        String name = input.nextLine();

        System.out.println("It's so nice to meet you, " + name + ". I'm Alice.");
        System.out.println("I have a book called 'Alice's Adventures in Wonderland.'");
        System.out.println("Write a word and see if it's in the first sentence.");
        String word = input.nextLine();

        String AliceOpening = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";


        if (AliceOpening.contains(word)) {
            System.out.println("The word: " + word + " is in the opening of my book! Look at you!");
        }
        else {
            System.out.println("Sorry, but the word: " + word + " is not in the opening sentence.");
        }
        System.out.println("Would you like to read my book? Y/N");
        String answer = input.nextLine();

        if (answer.contains("N")) {
            System.out.println("That's a little cheeky, don't you think?");
        }
        System.out.println(AliceOpening);
    }
}
