package algorithm;

import org.junit.Assert;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.Arrays;
import java.util.Scanner;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        class InsertionSorting {
            public Scanner scanner = new Scanner(System.in);

            public void main(String[] argh) {
                int[] arrNotSorted = newArrInitilizer();
                enterValues(arrNotSorted);
                sortArray(arrNotSorted);
                print(arrNotSorted);

            }

            //Print Array
            public void print(int[] arr) {
                System.out.print(Arrays.toString(arr));
            }

            /* looping from "i"(the incremented index in) ==> function
            public static int[] sortArray(int [] unsortedArr)
               first we initilize an integer "value"= Array[from])
            this will be assigned later to the Array in the minmum value index

            and while (from > 0) && (Array[from-1] > value)
            we assign every next value to the previous one

             eventually we decrement ("from")
           */
            public void insertionSorting(int[] toBesorted, int from) {
                int value = toBesorted[from];
                while (from > 0 && toBesorted[from - 1] > value) {
                    toBesorted[from] = toBesorted[from - 1];
                    --from;
                }

                toBesorted[from] = value;

            }

            /* Looping from index = 1, array with size one concidered sorted)
            later "From" will be assigned to i in the function above */
            public int[] sortArray(int[] unsortedArr) {
                for (int i = 1; i < unsortedArr.length; ++i) {
                    insertionSorting(unsortedArr, i);
                }

                return unsortedArr;
            }


            public int[] newArrInitilizer() {
                System.out.println("Enter Array Size .");
                int arrSize = scanner.nextInt();
                int[] arr = new int[arrSize];
                return arr;
            }


            public int[] enterValues(int[] arr) {
                System.out.println("Array being initlized randomly with " + arr.length + " values.");
                for (int i = 0; i < arr.length; ++i) {
                    arr[i] = (int) (Math.random() * 7);
                }
                return arr;
            }
        }

    }
}






