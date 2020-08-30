package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Map<String, Integer> words = new HashMap<>();
        Map<Integer, String> words = new HashMap<>();
        words.put(0, "book");
        words.put(1, "apple");
        words.put(2, "pen");
        words.put(0, "book");
        words.put(3, "fire");
        words.put(4, "door");
        words.put(1, "apple");
        words.put(5, "cat");
        words.put(6, "dog");
        words.put(7, "wood");

        System.out.println(words);

            



    }
}
