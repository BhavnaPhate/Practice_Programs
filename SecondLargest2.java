package Arrays;

import java.util.Scanner;

// Without using sort method finding second largest number

public class SecondLargest2 {
	
	void display(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void secondLargestNum(int arr[])
	{
		int first=0;
		int second=0;
		for(int i=0;i<arr.length;i++ )
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]> second && arr[i]!=first)
			{
				second=arr[i];
			}
		}
		System.out.println("Second largest number is: "+ second);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter numbers into array: ");
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		SecondLargest2 s=new SecondLargest2();
		System.out.println("Elements in array are: ");
		s.display(arr);
		s.secondLargestNum(arr);

	}

}
