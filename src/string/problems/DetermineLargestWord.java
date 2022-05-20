package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        wordNLength.put(1, "Human");
//        wordNLength.put(2, "brain");
//        wordNLength.put(3, "is");
//        wordNLength.put(4, "a");
//        wordNLength.put(5, "biological ");
//        wordNLength.put(6, "learning");
//        wordNLength.put(7, "machine");
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {

        return null;
    }


    Map<Integer, String> map = new HashMap<Integer, String>();

    {
        map.put(1, "Human");
        map.put(2, "brain");
        map.put(3, "is");
        map.put(4, "a");
        map.put(5, "biological");
        map.put(6, "learning");
        map.put(7, "machine");
        System.out.println(map);
    }

}












