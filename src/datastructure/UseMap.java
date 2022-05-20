package datastructure;

import java.util.*;
public class UseMap {

	public static <SharedStepsDatabase> void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<Object, Object> map = new HashMap<>();
		map.put(8454, "lamia");
		map.put(4567, "azar");
		map.put(7898, "rahim");
System.out.println("Mapping of HashMap is:"+map);
		// Retrieving "Keys" & "Values" using an Iterator
		Iterator<Object> mapIter = map.keySet().iterator();
		Object key;
		while (mapIter.hasNext()) {
			key = mapIter.next();
			System.out.println("KEY: " + key);
			System.out.println("VALUE: " + map.get(key));
		}
		String tableName = "`test_hash_map`";



	}

}
