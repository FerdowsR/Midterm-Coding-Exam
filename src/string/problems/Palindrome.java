package string.problems;

public class Palindrome {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.

         */
        public static void main(String[] args) {
            String myString = "level";
            StringBuffer buffer = new StringBuffer(myString);
            buffer.reverse();
            String data = buffer.toString();
            if(myString.equals(data)){
                System.out.println("Given String is palindrome");
            }else{
                System.out.println("Given String is not palindrome");
        }
    }
}
