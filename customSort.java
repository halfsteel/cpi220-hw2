package homework2;

import java.util.Stack;

public class CustomSort { 
    public static Stack sort(Stack a, int size) {
    Stack b = null;
    while((b = Stack.createStack(size)) != null);
    while ( !a.isEmpty() ) {
        Object temp = a.pop();
         
        //  Check if it ruins the invariant. 
        if ( temp < b.peek() && b.isEmpty() ) {
            drainFrom(b, a);
        }
         
        //  Push
        b.push(temp);
        }
        
        return b;
    } 
     private static void drainFrom(Stack a, Stack b) {
         while (!a.isEmpty() ) {
             b.push(a.pop());
         }
     }
}