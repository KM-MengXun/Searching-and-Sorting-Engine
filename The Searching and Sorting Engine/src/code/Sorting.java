package code;

import java.util.Scanner;

public class Sorting {

	public static void display(int arr[])
	{
		int a = 0;
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
			a++;
			if(a % 10 == 0)
				System.out.println("");
		}
	}
	
	public static void populateSequentially(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i;
			
		}
	}
	public static void populateRandomly(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()*arr.length + 1);
		}
	}
	
	public static void ifSorted(int arr[])
	{
		int counter = 0;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] < arr[i+1])
				counter++;   
		}
		if(counter != 0)
			System.out.println("It is not SORTED FLASE");
		else
			System.out.println("It is SORTED TRUE");
	}
	
	public static void shuffleArray(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			int shuffleNumber = (int)(Math.random()*(arr.length)+1);
			int temp = arr[i];
			arr[i] = arr[shuffleNumber];
			arr[shuffleNumber] = temp;
		}
	}
	
	public static void linearSearch(int arr [], int number)
	{
		int index = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == number)
			{
				index = i;
				break;
			}
		}
		System.out.println("The index of the number is: " + index);
	}
	
	public static void binarySearch(int arr[], int number)
	{
		int minIndex = 0, maxIndex = arr.length - 1;
		int midIndex = 0;
		if(arr[minIndex] == number)
			System.out.println("The index of the number is: " + minIndex);
		else if(arr[maxIndex] == number)
			System.out.println("The index of the number is: " + maxIndex);
		else
		{
			do
			{
				midIndex = (maxIndex + minIndex)/2;
				if(arr[midIndex] == number)
					System.out.println("The index of the number is: " + midIndex);
				if(arr[midIndex] < number)
				{
					minIndex = midIndex;
				}
				else if(arr[midIndex] > number)
				{
					maxIndex = midIndex;
				}
			}while(arr[midIndex] != number);
			
		}
		
	}
	public static void bubbleSort(int arr[])
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - 1 - i; j++)
			if (arr[j] > arr[j + 1])
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}

	}
	
	
	public static void selectionSearch(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			if(minIndex != i)
			{
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
			
		}
	}
	public static void insertionSort(int arr[])
	{
		for (int i = 1; i < arr.length; ++i) 
		{ 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) 
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
		
	}  
	public static void mergeSort(int arr [], int lowerBound, int higherBound)
	{
		if(lowerBound == higherBound)
			return;
//		lowerBound = 0;
//		higherBound = arr.length;
		int middle = (lowerBound + higherBound)/2;
		mergeSort(arr, lowerBound, middle);
		mergeSort(arr, middle + 1, higherBound);
		merge(arr, lowerBound, middle, higherBound);
	}
	public static void merge( int arr [], int low, int high, int mid)
	{
		int a1 = low;
		int a2 = mid + 1;
		int [] temp = new int [high - low + 1];
		int index = 0;    
		while (a1 <= mid && a2 <= high)
		{
			if(arr[a1] <= arr[a2])
			{  
				temp[index] = arr[a1];
				a1++;
				index++;
			}
			else
			{
				temp[index] = arr[a2];
				a2++;
				index++;
			}
		}
		while(a1 <= mid)
		{
			temp[index] = arr[a1];
			a1++;
			index++;
		}
		while(a2 <= high)
		{
			temp[index] = arr[a2];
			a2++;
			index++;
		}
		for (int i = 0; i < temp.length; i++) {
			arr[i+low] = temp[i];
		}
	}
	
	public static void quickSort(int arr[])
	{
		int pivot = (0 + arr.length - 1)/2;
		int leftIndex = 0, rightIndex = arr.length - 1;
		
	}
	public static void radixSort(int arr[]) 
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [10];
		Scanner input = new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.println("============================================");
			System.out.println("0. Exit");
			System.out.println("1. Display the array");
			System.out.println("2. Populate squentially");
			System.out.println("3. Popualte randomly");
			System.out.println("4. Check the array if it is sorted");
			System.out.println("5. Shuffle the array");
			System.out.println("6. Linear searching index");
			System.out.println("7. Binary searching index");
			System.out.println("8. Sort the list with bubble sort（两两互换）");
			System.out.println("9. Selection Sort");
			System.out.println("10. InsertionSort");
			System.out.println("11. Merge Sort");
			System.out.println("12. Quick Sort");
			System.out.println("13. Radix Sort");
			System.out.println("============================================");
			if(choice == 1)
				display(arr);
			if(choice == 2)
				populateSequentially(arr);
			if(choice == 3)
				populateRandomly(arr);
			if(choice == 4)
				ifSorted(arr);
			if(choice == 5)
				shuffleArray(arr);
			if(choice == 6)
			{
				System.out.println("What number you want to find");
				int number = input.nextInt();
				linearSearch(arr, number);
			}
			if(choice == 7)
			{
				System.out.println("What number you want to find");
				int number = input.nextInt();
				binarySearch(arr, number);
			}
			if(choice == 8)
				bubbleSort(arr);
			if(choice == 9)
				selectionSearch(arr);
			if(choice == 10)
				insertionSort(arr);
			if(choice == 11)
			{
				mergeSort(arr, 0, arr.length - 1);
			}
			if(choice == 12)
				quickSort(arr);
			if(choice ==13)
				radixSort(arr);
			choice = input.nextInt();
		}while(choice != 0);
	}

}



