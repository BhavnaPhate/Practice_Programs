package Arrays;

import java.util.Scanner;

public class SecondLargest {
	
	void display(int arr[]) 
	{
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	int[] sArray(int arr[])
	{
		for(int i=0; i<arr.length-1; i++) 
		{
			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[i]<arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements into an array: ");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Given array is: ");
		SecondLargest sl=new SecondLargest();
		sl.display(arr);
		System.out.println();
		
		int arr1[]=sl.sArray(arr);
		System.out.println("Second largest element in an array is: "+ arr1[1]);

	}

}
