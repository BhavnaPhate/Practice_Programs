package Arrays;

import java.util.Scanner;

public class CountChar {
	
	void display (char ch[]) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}
	
	void counter(char ch[], char letter) {
		int count=0;
		for(int i=0; i<ch.length; i++) {
			if(letter==ch[i]) {
				count++;
			}
		}
		System.out.println("Frequency of "+ letter+ " is "+ count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		
		int size=sc.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter characters: ");
		
		for(int i=0; i<size; i++) {
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Characters in array are: ");
		
		CountChar cc=new CountChar();
		
		cc.display(ch);
		System.out.println();
		System.out.println("Enter char to check its no of repetetion: ");
		
		char letter=sc.next().charAt(0);
		cc.counter(ch, letter);

	}

}
