package homework2;

import java.util.Stack;

public class customSort {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while (!System.in.isEmpty()) {
            String item = System.in.readString();
            if (!item.equals("-"))
                stack.push(item);
            else if (!stack.isEmpty())
                System.out.print(stack.pop() + " ");
        }
        System.out.println("(" + stack.size() + " left on stack)");
    }
}
