package homework2;

import java.io.*;
import java.util.*;

public class quicksort<array> 
{

	public static Integer[] getClient() throws IOException 
	{
		return Client.readLines();
	}

	private static void sort(Comparable[] a, Integer lo, Integer hi) 
	{ 
		if (hi <= lo) return;
		Integer j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}

	public Comparable[] sort(Comparable[] a) throws IOException 
	{
		a = random(quicksort.getClient());
		sort(a, 0, a.length - 1);
		return a;
	}
	
	public Comparable[] fixedSort(Comparable[] a) throws IOException 
	{
		a = random(Client.fixedArray());
		sort(a, 0, a.length - 1);
		return a;
	}

	public static Integer partition(Comparable[] a, Integer lo, Integer hi) 
	{
        Integer i = lo -1;
        Comparable v = a[hi];
        for (Integer j = lo; j <= hi - 1; j++){
            if(lessEquals(a[j],v)){
                i++;
                exch(a, i, j);
            }
        }
        exch(a, i+1, hi);
        return (i+1);
    }

	public static Comparable[] random(Comparable[] a){	

		List<Comparable> list = Arrays.asList(a);
		Collections.shuffle(list);
		Object[] random = list.toArray();
		return (Comparable[]) random;
	}

	private static boolean lessEquals(Comparable v, Comparable w) {
     return v.compareTo(w) < 0;
 }

	private static void exch(Object[] a, Integer i, Integer j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}


