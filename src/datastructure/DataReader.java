package datastructure;
import java.io.*;


public class DataReader<let> {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *fo
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		String textFilePath = null;
		File file = new File(textFilePath);
		BufferedReader br = new BufferedReader(new FileReader(textFilePath));
		String st;
//        null
//        while(st = br.readLine()) !=null)
//        System.out.println(st);
		try {
			String filename = null;
			br = new BufferedReader(new FileReader(filename));
			System.out.println("---------Contents of the file---------\n-------------------------------------\n");
			String line;
			while( (line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Oops! Please check for the presence of file in the path specified.");

		} catch (IOException e) {
			System.err.println("Oops! Unable to read the file.");

		}
	}

	// push letter into stack

	}

//    try{

//    //sql connection object
//    using (SqlConnection conn = new SqlConnection(connString))
//    {
//catch (Exception ex)

//    Console.WriteLine("Outer Exception: " + ex.Message);

//finally
//
//    Console.WriteLine();
//    Console.WriteLine("...program execution after database calls...");
// push letter into stack











