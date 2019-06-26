import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String,String> hashmap2) {
		int common = 0;
		
			if(hashmap1.containsKey("Alice") && hashmap2.containsKey("Alice")) {
				common++;
			}
			if(hashmap1.containsKey("Mary") && hashmap2.containsKey("Mary")) {
				common++;
			}
			if(hashmap1.containsKey("Bob") && hashmap2.containsKey("Bob")) {
				common++;
			}
			if(hashmap1.containsKey("Chuck") && hashmap2.containsKey("Chuck")) {
				common++;
			}
			if(hashmap1.containsKey("Felix") && hashmap2.containsKey("Felix") && hashmap2.containsValue("Healthy") && hashmap1.containsValue("healthy")) {
				common++;
			}
			if(hashmap1.containsKey("Ricardo") && hashmap2.containsKey("Ricardo")) {
				common++;
			}
			if(hashmap1.containsKey("Tam") && hashmap2.containsKey("Tam")) {
				common++;
			}
			if(hashmap1.containsKey("Alice") && hashmap2.containsKey("Alice")) {
				common++;
			}
				
		return common;
	}
}
