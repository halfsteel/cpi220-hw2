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

		System.out.print("The run time of this quicksort was: ");
		System.out.print(timeEst);
		System.out.println(" nanoseconds");

		stack b = null;
		int size = 0;
		Stack<Integer> input = null;

		timeStart = System.nanoTime();
		CustomSort.sort(b,size);
		timeEst = System.nanoTime() - timeStart;

		System.out.print("The run time of this CustomSort was: ");
		System.out.print(timeEst);
		System.out.println(" nanoseconds");

		Client.writeToStack();

		System.out.println(Client.compareFile(null, null));
		String output = null;
		String expected = null;
		System.out.println(Client.compareStackFiles(output, expected));
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

	public static Stack readToStack() throws Exception {

		Stack mystack = new Stack();
		switch(letter)
		{
		case 'A':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_10.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			for(int i=0; i<10; i++) 
			{
				String line = br.readLine();
				int stackLine = Integer.parseInt(line);
				mystack.push(stackLine);
			}
			break;
		}
		case 'B':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_100.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			for(int i=0; i<100; i++) 
			{
				String line = br.readLine();
				int stackLine = Integer.parseInt(line);
				mystack.push(stackLine);
			}
			break;
		}
		case 'C':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_1000.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			for(int i=0; i<1000; i++) 
			{
				String line = br.readLine();
				int stackLine = Integer.parseInt(line);
				mystack.push(stackLine);
			}
			break;
		}
		case 'D':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_10000.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			for(int i=0; i<10000; i++) 
			{
				String line = br.readLine();
				int stackLine = Integer.parseInt(line);
				mystack.push(stackLine);
			}
			break;
		}
		case 'E':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\arrayLength_100000.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			for(int i=0; i<100000; i++) 
			{
				String line = br.readLine();
				int stackLine = Integer.parseInt(line);
				mystack.push(stackLine);
			}
			break;
		}
		}

		return mystack;

	}


	public static Integer[] writeLines() throws IOException
	{
		Integer[] a = new Integer[1000000];  
		switch(letter) 
		{
		case 'A':
		{
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_10.txt";
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
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_100.txt";
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
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_1000.txt";
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
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_10000.txt";
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
			String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_100000.txt";
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

	public static Stack writeToStack() throws Exception 
	{
		Stack mystack = new Stack();
		boolean compare = true;
		switch(letter) 
		
		{
		case 'A':
		{
		String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_10.txt";
		FileWriter fw = new FileWriter(fileName);
		stack b = null;
		int size = 0;
		Stack<Integer> input = null;
		mystack = CustomSort.sort(b,size);
		for (int i=0;i<10;i++)
		{
		Integer stackPosition = (Integer) mystack.get(i);
		fw.write(stackPosition + "\r\n");
		}
		fw.close();
		break;
		}
		case 'B':
		{
		String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_100.txt";
		FileWriter fw = new FileWriter(fileName);
		stack b = null;
		int size = 0;
		Stack<Integer> input = null;
		mystack = CustomSort.sort(b,size);
		for (int i=0;i<10;i++)
		{
		Integer stackPosition = (Integer) mystack.get(i);
		fw.write(stackPosition + "\r\n");
		}
		fw.close();
		break;
		}
		case 'C':
		{
		String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_1000.txt";
		FileWriter fw = new FileWriter(fileName);
		stack b = null;
		int size = 0;
		Stack<Integer> input = null;
		mystack = CustomSort.sort(b,size);
		for (int i=0;i<10;i++)
		{
		Integer stackPosition = (Integer) mystack.get(i);
		fw.write(stackPosition + "\r\n");
		}
		fw.close();
		break;
		}
		case 'D':
		{
		String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_10000.txt";
		FileWriter fw = new FileWriter(fileName);
		stack b = null;
		int size = 0;
		Stack<Integer> input = null;
		mystack = CustomSort.sort(b,size);
		for (int i=0;i<10;i++)
		{
		Integer stackPosition = (Integer) mystack.get(i);
		fw.write(stackPosition + "\r\n");
		}
		fw.close();
		break;
		}
		case 'E':
		{
		String fileName="C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_100000.txt";
		FileWriter fw = new FileWriter(fileName);
		stack b = null;
		int size = 0;
		Stack<Integer> input = null;
		mystack = CustomSort.sort(b,size);
		for (int i=0;i<10;i++)
		{
		Integer stackPosition = (Integer) mystack.get(i);
		fw.write(stackPosition + "\r\n");
		}
		fw.close();
		break;
		}
		}
		return mystack;

	}
	public static String compareFile(String output, String expected)throws Exception 
	{

		String yes = "The quicksort output is the same as the expected file";
		String no = "The quicksort output is not the same as the expected file";
		boolean compare = true;
		switch(letter) 
		{
		case 'A':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_10.txt";
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
			break;
		}
		case 'B':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_100.txt";
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
			break;
		}
		case 'C':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_1000.txt";
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
			break;
		}
		case 'D':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_10000.txt";
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
			break;
		}
		case 'E':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\quick_output_100000.txt";
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
			break;
		}
		}
		if (compare==true)
			return yes;
		else
			return no;
	}

	public static String compareStackFiles(String output, String expected)throws Exception 
	{

		String yes = "The CustomSort output is the same as the expected file";
		String no = "The CustomSort output is not the same as the expected file";
		boolean compare = true;
		switch(letter) 
		{
		case 'A':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_10.txt";
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
			break;
		}
		case 'B':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_100.txt";
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
			break;
		}
		case 'C':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_1000.txt";
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
			break;
		}
		case 'D':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_10000.txt";
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
			break;
		}
		case 'E':
		{
			output = "C:\\Users\\halfs\\eclipse-workspace\\homework2\\src\\homework2\\stack_output_100000.txt";
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
			break;
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
