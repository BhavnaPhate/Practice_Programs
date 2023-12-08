package Arrays;

import java.util.Scanner;

public class DemoArray2 {
	void display(int arr[]) {
		for(int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of array");

	}

}
