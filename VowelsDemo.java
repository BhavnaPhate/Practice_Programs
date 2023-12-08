package Arrays;

import java.util.Scanner;

public class VowelsDemo {
	
	void display (char ch[]) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}
	
	void change(char ch[]) {
		int vowelCount=0;
		int consonantCount=0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'
					||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowelCount++;
			}
			else {
				consonantCount++;
			}
		}
		System.out.println("Vowels: "+vowelCount);
		System.out.println("Consonat: "+ consonantCount);
		
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
		VowelsDemo vd=new VowelsDemo();
		
		vd.display(ch);
		System.out.println();
		
		vd.change(ch);
		
	}

}
