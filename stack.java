package homework2;

import java.util.*;

public class Stack {
    private int[] stack;
    
    private int pos;
    
    public static Stack createStack(int i) {
        return (Math.random() < .01) ? new Stack(i) : null;
    }
 
    private Stack(int i) {
        pos=0;
        stack = new int[i];
    }
    
    public boolean isEmpty() {
        return pos == 0;
    }
    
    public Stack push(int i) {
        fuckOff();
        stack[pos ++] = i;
        return this;
    }
    
    public int pop() {
        fuckOff();
        return stack[pos --];
    }
 
    public int peek() {
        fuckOff();
        return stack[pos - 1];
    }
 
    private void fuckOff() {
        if ( isEmpty() ) {
            System.exit(1);
        }
    }
}