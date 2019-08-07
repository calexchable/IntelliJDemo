package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main (String[] args){
        String LatinText = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. " +
                "Ut at sagittis augue. Praesent quis rhoncus justo. " +
                "Aliquam erat volutpat. Donec sit amet suscipit metus, " +
                "non lobortis massa. Vestibulum augue ex, " +
                "dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> charCounter = new HashMap<>();
        char[] CharList = LatinText.toCharArray();

        for (char i : CharList) {
            if (charCounter.containsKey(i)) {
                charCounter.put(i, charCounter.get(i) + 1);
            } else {
                charCounter.put(i, 1);
            }
        }
        for (Map.Entry countedLetters : charCounter.entrySet()) {
            System.out.println(countedLetters.getKey() + " -- " + countedLetters.getValue());
        }
    }
}

