package homework2;

import java.io.*;
import java.util.*;


public class Client
{	
	public static final char letter = input();

	public static void main(String[] a) throws Exception
	{
		long timeStart = System.nanoTime();
		quicksort.sort(a);
		long timeEst = System.nanoTime() - timeStart;
		
		Client.writeLines();

		System.out.print("The run time of this sort was: ");
		System.out.print(timeEst);
		System.out.println(" nanoseconds");

		System.out.println(Client.compareFile(null, null));
	}

	public static final char input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose:\nA for arrayLength_10\nB for arrayLength_100\nC for arrayLength_1000\nD for arrayLength_10000\nE for arrayLength_100000");
		char letter = scan.next().trim().charAt(0);
		scan.close();
		letter = Character.toUpperCase(letter);
		return letter;
	}

	public static Integer[] readLines() throws IOException
	{

		Integer[] array = new Integer[1000000];
		switch(letter) 
		{
		case 'A':
		{
			array = new Integer[10];
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_10.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			for(int i=0; i<array.length; i++) 
			{
				array[i]=Integer.parseInt(br.readLine());
			}
			br.close();
			break;
		}
		case 'B':
		{
			array = new Integer[100];
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_100.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			for(int i=0; i<array.length; i++) 
			{
				array[i]=Integer.parseInt(br.readLine());
			}
			br.close();
			break;
		}

		case 'C':
		{
			array = new Integer[1000];
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_1000.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			for(int i=0; i<array.length; i++) 
			{
				array[i]=Integer.parseInt(br.readLine());
			}
			br.close();
			break;
		}

		case 'D':
		{
			array = new Integer[10000];
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_10000.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			for(int i=0; i<array.length; i++) 
			{
				array[i]=Integer.parseInt(br.readLine());
			}
			br.close();
			break;
		}

		case 'E':
		{
			array = new Integer[100000];
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_100000.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			for(int i=0; i<array.length; i++) 
			{
				array[i]=Integer.parseInt(br.readLine());
			}
			br.close();
			break;
		}
		default:
			System.out.println("Invalid choice");
		}
		return array;
	}

	public static Integer[] writeLines() throws IOException
	{
		Integer[] a = new Integer[1000000];  
		switch(letter) 
		{
		case 'A':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_10.txt";
			FileWriter fw = new FileWriter(fileName);
			Integer[] sortedArray = (Integer[]) quicksort.sort(a);


			for (int i = 0; i < sortedArray.length; i++) {
				fw.write(sortedArray[i] + "\r\n");
			}
			fw.close();
			break;
		}
		case 'B':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_100.txt";
			FileWriter fw = new FileWriter(fileName);
			Integer[] sortedArray = (Integer[]) quicksort.sort(a);


			for (int i = 0; i < sortedArray.length; i++) {
				fw.write(sortedArray[i] + "\r\n");
			}
			fw.close();
			break;
		}
		case 'C':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_1000.txt";
			FileWriter fw = new FileWriter(fileName);
			Integer[] sortedArray = (Integer[]) quicksort.sort(a);


			for (int i = 0; i < sortedArray.length; i++) {
				fw.write(sortedArray[i] + "\r\n");
			}
			fw.close();
			break;
		}
		case 'D':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_10000.txt";
			FileWriter fw = new FileWriter(fileName);
			Integer[] sortedArray = (Integer[]) quicksort.sort(a);


			for (int i = 0; i < sortedArray.length; i++) {
				fw.write(sortedArray[i] + "\r\n");
			}
			fw.close();
			break;
		}
		case 'E':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_100000.txt";
			FileWriter fw = new FileWriter(fileName);
			Integer[] sortedArray = (Integer[]) quicksort.sort(a);


			for (int i = 0; i < sortedArray.length; i++) {
				fw.write(sortedArray[i] + "\r\n");
			}
			fw.close();
			break;
		}
		}
		return a;
	}

	public static String compareFile(String output, String expected)throws Exception 
	{

		String yes = "they are the same two files";
		String no = "they are not the same two files";
		boolean compare = true;
		switch(letter) 
		{
		case 'A':
		{
		output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_10.txt";
		expected = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\expected_output_10.txt";

		FileReader fr1 = new FileReader(output);
		FileReader fr2 = new FileReader(expected);

		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);

		String line1 = null;
		String line2 = null;
		while ((compare==true) &&((line1 = br1.readLine()) != null)&&((line2 = br2.readLine()) != null)) 
		{
			if (!line1.equalsIgnoreCase(line2))  
				compare = false;
			else 
				compare = true;   
		}
		br1.close();
		br2.close();
		}
		case 'B':
		{
		output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_100.txt";
		expected = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\expected_output_100.txt";

		FileReader fr1 = new FileReader(output);
		FileReader fr2 = new FileReader(expected);

		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);

		String line1 = null;
		String line2 = null;
		while ((compare==true) &&((line1 = br1.readLine()) != null)&&((line2 = br2.readLine()) != null)) 
		{
			if (!line1.equalsIgnoreCase(line2))  
				compare = false;
			else 
				compare = true;   
		}
		br1.close();
		br2.close();
		}
		case 'C':
		{
		output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_1000.txt";
		expected = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\expected_output_1000.txt";

		FileReader fr1 = new FileReader(output);
		FileReader fr2 = new FileReader(expected);

		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);

		String line1 = null;
		String line2 = null;
		while ((compare==true) &&((line1 = br1.readLine()) != null)&&((line2 = br2.readLine()) != null)) 
		{
			if (!line1.equalsIgnoreCase(line2))  
				compare = false;
			else 
				compare = true;   
		}
		br1.close();
		br2.close();
		}
		case 'D':
		{
		output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_10000.txt";
		expected = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\expected_output_10000.txt";

		FileReader fr1 = new FileReader(output);
		FileReader fr2 = new FileReader(expected);

		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);

		String line1 = null;
		String line2 = null;
		while ((compare==true) &&((line1 = br1.readLine()) != null)&&((line2 = br2.readLine()) != null)) 
		{
			if (!line1.equalsIgnoreCase(line2))  
				compare = false;
			else 
				compare = true;   
		}
		br1.close();
		br2.close();
		}
		case 'E':
		{
		output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_100000.txt";
		expected = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\expected_output_100000.txt";

		FileReader fr1 = new FileReader(output);
		FileReader fr2 = new FileReader(expected);

		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);

		String line1 = null;
		String line2 = null;
		while ((compare==true) &&((line1 = br1.readLine()) != null)&&((line2 = br2.readLine()) != null)) 
		{
			if (!line1.equalsIgnoreCase(line2))  
				compare = false;
			else 
				compare = true;   
		}
		br1.close();
		br2.close();
		}
		}
		if (compare==true)
			return yes;
		else
			return no;
	}

	private static quicksort quicksort = new quicksort();
	public quicksort getQuicksort() {
		return quicksort;
	}

	public void setQuicksort(quicksort quicksort) {
		Client.quicksort = quicksort;
	}

}
