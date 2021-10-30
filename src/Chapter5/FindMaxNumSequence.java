package Chapter5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindMaxNumSequence {
	
	public String question = "find the max value and return position in NumSequence";
	
	public int getMaxNumSequnce(int input) {
		int key = 1;
		int position =-1;
		HashMap<Integer, Integer> sequence = new HashMap<>();
		
		if (input <1) {
			System.out.println("input cannot be negative");
			System.exit(0);
		}
		
		sequence.put(key,input);
		
		//populate the map
		while (input > 1) {
			 	++key;
			 	if (input % 2 ==0) {
			 		input /= 2;
			 		sequence.put(key, input);
			 	} else {
			 		input = 3 * input + 1;
			 		sequence.put(key, input);
			 	}
		}
		
		//find the maxValue and return the key
		int maxValue = (Collections.max(sequence.values()));
		for (Entry<Integer, Integer> entry: sequence.entrySet()) {
			 if (entry.getValue() == maxValue) {
				  position = entry.getKey();
			 } 
		}
		
		return position;
		
	}

}
