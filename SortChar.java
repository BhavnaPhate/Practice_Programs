package Arrays;

import java.util.Scanner;

public class SortChar {
	
	void display(char arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}		
	}
	char[] SortChar(char arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		
		int size=sc.nextInt();
		char arr[]=new char[size];
		System.out.println("Enter characters: ");
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.next().charAt(0);
			
		}
			System.out.println("Characters in array are: ");
			SortChar ch=new SortChar();
			ch.display(arr);
			
			char arr2[]=ch.SortChar(arr);
			System.out.println("Characters in ascending order are: ");
			ch.display(arr2);
			
		}
		

	}


