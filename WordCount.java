package Arrays;

import java.util.Scanner;

//Write a program to take string from user and find no of words in given string

public class WordCount {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");	
		String s1=sc.nextLine();
		
		// trim () removes space from starting and end position 
		s1=s1.trim();
		String noOfWords[]=s1.split(" ");
		System.out.println(noOfWords.length);	
	}

}
