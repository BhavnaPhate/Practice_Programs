package Arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter elements: ");
		
		for(int i=0; i<size; i++) {
			array[i]= sc.nextInt();{
				if(array[i]%2==0) {
					System.out.println(array[i]+" is even no");
				}
				else {
					System.out.println(array[i]+ " is odd no");
				}
			}
		}
	}
}
