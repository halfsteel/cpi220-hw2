package homework2;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Client
{	
	public static final char letter = input();
	
	public static void main(String[] a) throws IOException
	{
		a = new String[1000000];
		long timeStart = System.currentTimeMillis();
		quicksort.sort(a);
		long timeEnd = System.currentTimeMillis();
		Client.writeLines();

		System.out.print("The run time of this sort was: ");
		System.out.print(timeEnd-timeStart);
		System.out.println(" milliseconds");
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
		String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\output_100.txt";
		FileWriter fw = new FileWriter(fileName);
		Integer[] sortedArray = (Integer[]) quicksort.sort(a);


		for (int i = 0; i < sortedArray.length; i++) {
			fw.write(sortedArray[i] + "\r\n");
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
