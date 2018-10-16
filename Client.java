package homework2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Client
{	
	public static void main(String[] a) throws IOException
	{
		a = new String[100000];
		quicksort.sort(a);
		Client.writeLines();
	}
	
	public static String[] readLines() throws IOException 
	{

        String[] array = new String[100];
		/*char length = 'A';
		switch(length) 
		{
		case 'A':*/
		String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_100.txt";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
       for(int i=0; i<array.length; i++) 
       {
        	array[i]=br.readLine();
       }
        br.close();
	//}
        return array;
        }
	
	public static String[] writeLines() throws IOException
	{
			String[] a = new String[100000];  
			FileWriter fw = new FileWriter("output_100.txt");
		    String[] sortedArray = (String[]) quicksort.sort(a);

		    for (int i = 0; i < sortedArray.length; i++) {
		      fw.write(sortedArray[i] + "\n");
		    }
		    fw.close();
			return a;
		
	}

	private static quicksort quicksort = new quicksort();
	public quicksort getQuicksort() {
		return quicksort;
	}

	public void setQuicksort(quicksort quicksort) {
		Client.quicksort = quicksort;
	}
	
}
