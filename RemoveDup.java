package Arrays;

import java.util.Scanner;

public class RemoveDup {
	
	void display(int arr[]) {
		for(int i=-0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	int[] asc(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	int[] duplicate(int arr[])
	{
		int index=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[index]=arr[i];
				index++;
			}
		}
		
		arr[index]=arr[arr.length-1];
		index++;
		int arr2[]=new int[index];
		for(int i=0; i<index; i++)
		{
			arr2[i]=arr[i];
		}
		return arr2;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter numbers into an array: ");
		
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Given array is: ");
		RemoveDup rd=new RemoveDup();
		rd.display(arr);
		System.out.println();
		
		int arr1[]=rd.asc(arr);
		System.out.println("Elements in asc order are: ");
		rd.display(arr1);
		System.out.println();
		
		System.out.println("After removing duplicates: ");
		int arr2[]=rd.duplicate(arr1);
		rd.display(arr2);
		
	}

}
