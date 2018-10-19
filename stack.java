package homework2;

import java.util.*;

public class stack {
    
    private int[] stack;
    private int pos;
 
    public stack(int i) {
        pos=0;
        stack = new int[i];
    }
    
    public boolean isEmpty() {
        return pos == 0;
    }
    
    public void push(int i) {
        stack[pos ++] = i;
    }
    
    public int pop() {
        return stack[-- pos];
    }

}