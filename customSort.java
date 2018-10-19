package homework2;

import java.util.Stack;

public class customSort {

    int arr[] = new int[100];

    public void Sort() {
        while (!isSorted)
            Arrays.shuffle(arr);
    }
    
    public boolean isSorted() {
        int prev = 0;
        boolean first = true;
        for (int i : arr) {
            if (first) {
                first = !first;
                prev = i;
            }
            else if ( prev > i ){
                return false;
            } 
        }
        return true;
    }
}