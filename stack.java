package homework2;

import java.util.*;

public class Stack {
    private static int[] stack;
    private static boolean created = false;
    public static final int SIZE=100;
    
    private int pos;
    
    Stack() {
        pos=0;
    }
    
    public static int[] getInstance() {
        if ( ! created ) {
            stack = new int[SIZE];
            created = true;
        }
        return stack;
    }
    
    public boolean isEmpty() {
        return pos == 0;
    }
    
    public int[] push(int i) throws Exception {
        if ( SIZE == pos ) {
            throw new Exception();
        }
        stack[pos ++] = i;
        return stack;
    }
    
    public int pop() throws Exception {
        if ( isEmpty() ) {
            throw new Exception();
        }
        return stack[pos --];
    }
}