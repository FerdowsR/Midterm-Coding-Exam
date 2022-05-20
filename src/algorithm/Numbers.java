package algorithm;

import databases.ConnectToSqlDB;

import java.io.OptionalDataException;
import java.util.List;
import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	private static void main(String[] args) throws Exception {

		int[] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		void printValuefor;
		for (String number : (numbers)) {

		}

		}

	private static void storeRandomNumbers(int[] num) {
	}

	private OptionalDataException num;
	int n = num.length;
		

		//By following above, Continue for rest of the Sorting Algorithm....
		public static <Sorting, SharedStepsDatabase> void main(String[] args) throws Exception {
			// Declare and initialize an array of a desired length with random numbers
			int[] numberArray = new int[100];
			insertRandomNumbersIntoArray(numberArray);
	}

	private static void insertRandomNumbersIntoArray(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000000);
		}
	}

	/**
	 * Randomizes the numbers in an int[] array
	 *
	 * array The array to be randomized
	 */
	private static void randomize(int[] array) {
		Random r = new Random();
		int n = array.length;

        /*
         Start from the last element and swap one by one. We don't
         need to run for the first element that's why i > 0
         */
		for (int i = n - 1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	/**
	 * Prints all values in a List<String>
	 *
	 * @param list List containing the values to be printed
	 */
	private static void printValue(List<String> list) {
		for (String st : list) {
			System.out.println(st);
		}
	}
}


	public static void randomize() {
		randomize();
	}

	public static void randomize(int[] array) {
		Random r = new Random();
		int n = array.length;

        /*
         Start from the last element and swap one by one. We don't
         need to run for the first element that's why i > 0
         */
		for (int i = n - 1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	
	}