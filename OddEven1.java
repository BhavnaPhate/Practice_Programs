package Arrays;

import java.util.Scanner;

public class OddEven1 {
	
	void display(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
	void evenOddCounter(int arr[]) {
		int evenCounter=0;
		int oddCounter=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				evenCounter++;		
			}
			else {
				oddCounter++;		
			}
		}
		System.out.println("Even nos are :"+ evenCounter);
		System.out.println("Even nos are :"+ evenCounter);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements: ");
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		OddEven1 ob=new OddEven1();
		ob.display(arr);
		System.out.println();
		ob.evenOddCounter(arr);

	}

}
