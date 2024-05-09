package map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String [] args) {
		Map<String, Integer> map1 = new HashMap<>(Map.of("john", 23, "lewis", 24,  "mary",19));

		// Basic Operations

		System.out.println("Original map: " + map1.toString());

		System.out.println("The size of the map is: " + map1.size());
		System.out.println("The map is empty?: " + map1.isEmpty());
		
		System.out.println("The value mapped to key \"lewis\" is: " + map1.get("lewis"));
		System.out.println("The value mapped to key \"elisabeth\" is: " + map1.get("elisabeth"));
		
		map1.put("charles", 78);
		System.out.println("The map after putting key \"charles\" and value 78: " + map1.toString());
		
		map1.remove("john");
		System.out.println("The map after removing key \"john\": " + map1.toString());
		
		map1.put("charles", 70);
		System.out.println("The map after putting key \"charles\" and value 70: " + map1.toString());
		
		map1.put("james", 30);
		System.out.println("The map after putting key \"james\" and value 30: " + map1.toString());
		
		map1.putIfAbsent("charles", 65);
		System.out.println("The map after putting if absent key \"charles\" and value 65: " + map1.toString());
		
		map1.put("elisabeth", 19);
		System.out.println("The map after putting if absent key \"elisabeth\" and value 19: " + map1.toString());
		
		System.out.println("The value mapped to key (or default) \"lewis\" is: " + map1.getOrDefault("lewis", 40));
		System.out.println("The value mapped to key (or default) \"diana\" is: " + map1.getOrDefault("diana", 40));

		System.out.println("The map contains key \"lewis\" is: " + map1.containsKey("lewis"));
		System.out.println("The map contains key \"sarah\" is: " + map1.containsKey("sarah"));

		System.out.println("The map contains value 40 is: " + map1.containsValue(40));
		System.out.println("The map contains value 37 is: " + map1.containsValue(37));

		map1.putAll(Map.of("sarah", 27, "henry", 26));

		System.out.println("The map after putting ((\"sarah\", 27), (\"henry\", 26): \n" + map1.toString());
		
		System.out.println("Map's set of keys: " + map1.keySet().toString());
		System.out.println("Map's set of values: " + map1.values().toString());
		System.out.println("Map's set of entries: " + map1.entrySet().toString());
		for (Map.Entry<String, Integer> e : map1.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		System.out.println("Map after one year: ");
		for (Map.Entry<String, Integer> e : map1.entrySet()) {
			e.setValue(e.getValue() + 1);
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
	}
	
}
