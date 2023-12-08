package Arrays;

// when user enters vowel then change it with next alphabet and when its consonant change with previous letter

import java.util.Scanner;

public class SwapChars {
	
	void display(char ch[]) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}
	
	char[] replace(char ch[]) {
		
		for(int i=0; i<ch.length;i++) {
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||
					ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
			{
				char ch1=ch[i];
				ch[i]=(char)(ch1+1);
			}
			else {
				char ch1=ch[i];
				ch[i]=(char) (ch1-1);
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		
		char ch[]= new char [size];
		System.out.println("Enter characters: ");
		for(int i=0; i<size; i++) {
			ch[i]=sc.next().charAt(0);
		}
		SwapChars obj=new SwapChars();
		obj.display(ch);
		System.out.println();
		char ch2[]=obj.replace(ch);
		obj.display(ch2);
	}

}
