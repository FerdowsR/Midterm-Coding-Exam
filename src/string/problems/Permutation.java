package string.problems;

public class Permutation {

    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */
    public static void main(String[] args) {
        String s = "Stress";
        printPermutation(s, "");
    }

    static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printPermutation(ros, ans + character);
        }
    }
}