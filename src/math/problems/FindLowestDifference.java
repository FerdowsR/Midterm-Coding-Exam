package math.problems;

import java.io.OptionalDataException;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        // initialize with largest possible value
        int lowest = Integer.MAX_VALUE;
        //find lowest element of array
        int index = 0;
        while (index < array1.length) {
            //check if lowest is greater than element
            if (lowest > array1[index]) {
                lowest = array1[index];
            }
            index++;
        }
        System.out.println("The loswest number is:" + lowest);
    }
}





