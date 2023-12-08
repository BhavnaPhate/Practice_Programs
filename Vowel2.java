package Arrays;

import java.util.Scanner;

public class Vowel2 {
	
	void display (char ch[]) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}
	
	char[] change(char ch[]) {
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||
					ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
			{
			ch[i]='*';
			}	
			else {
				ch[i]='T';
			}
	}
		return ch;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size= sc.nextInt();
		char ch[]= new char[size];
		System.out.println("Enter the characters: ");
		
		for(int i=0; i<size; i++) {
			ch[i]=sc.next().charAt(0);	
		}
		System.out.println("Characters in array are: ");
		Vowel2 vd=new Vowel2();
		
		vd.display(ch);
		System.out.println();
		ch=vd.change(ch);
		vd.display(ch);
	}

}
