package homework2;

import java.util.Arrays;
import java.util.Stack;

public class CustomSort { 

	public static Stack sort(stack b, int size) throws Exception {Stack<Integer> unsorted = new Stack<>();
	unsorted = Client.readToStack();
	Stack<Integer> sorted = new Stack<>();
	sorted.push(unsorted.pop());
	while (!unsorted.isEmpty()) {
		int nextToInsert = unsorted.pop();
		int numElementsDeep = 0;
		while (!sorted.isEmpty() && sorted.peek() > nextToInsert) {
			numElementsDeep++;
			unsorted.push(sorted.pop());
		}
		sorted.push(nextToInsert);
		for (int i = 0; i < numElementsDeep; i++) {
			sorted.push(unsorted.pop());
		}
	}
	//System.out.println(Arrays.toString(sorted.toArray()));
	return sorted;
	}
}