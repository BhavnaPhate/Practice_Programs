package Arrays;

import java.util.Scanner;

public class DescOrder {
	
	void display(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	int[] sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					
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
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements into array: ");
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements in array are: ");
		 DescOrder ob=new DescOrder();
		 ob.display(arr);
		 System.out.println();
		
		int arr2[]=ob.sortArray(arr);
		System.out.println("Elements in Desc order are: ");
		ob.display(arr2);

	}

}
