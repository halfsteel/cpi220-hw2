package homework2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class quicksort<array> {

	private Client client = new Client();

	public static Integer[] getClient() throws IOException {

		return Client.readLines();
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// quicksort the subarray from client[lo] to client[hi]
	private static void sort(Comparable[] a, Integer lo, Integer hi) { 
		if (hi <= lo) return;
		Integer j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}

	public Comparable[] sort(Comparable[] a) throws IOException {

		a = RandomizeArray(quicksort.getClient());
		sort(a, 0, a.length - 1);
		/*for (Integer i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		return a;
	}

	// partition the subarray client[lo..hi] so that client[lo..j-1] <= client[j] <= client[j+1..hi]
	// and return the index j.
	public static Integer partition(Comparable[] a, Integer lo, Integer hi) {
        Integer i = lo -1;
        Comparable v = a[hi];
        for (Integer j = lo; j <= hi - 1; j++){
            if(lessEquals(a[j],v)){
                i++;
                exch(a, i, j);
            }
        }
        // put partitioning item v at client[j]
        exch(a, i+1, hi);
        // now, client[lo .. j-1] <= client[j] <= client[j+1 .. hi]
        return (i+1);
    }



	public static Comparable[] RandomizeArray(Comparable[] a){	

		List<Comparable> list = Arrays.asList(a);

		Collections.shuffle(list);
		Object[] randomArray = list.toArray();

		return (Comparable[]) randomArray;
	}

	/***************************************************************************
	 *  Helper sorting functions.
	 ***************************************************************************/

	// is v < w ?
	private static boolean lessEquals(Comparable v, Comparable w) {
     return v.compareTo(w) < 0;
 }

	// exchange client[i] client client[j]
	private static void exch(Object[] a, Integer i, Integer j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}


	/***************************************************************************
	 *  Check if array is sorted - useful for debugging.
	 ***************************************************************************/
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, Integer lo, Integer hi) {
		for (Integer i = lo + 1; i <= hi; i++)
			if (lessEquals(a[i], a[i-1])) return false;
		return true;
	}
}



