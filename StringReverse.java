package Arrays;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a string: ");
	String s1=sc.nextLine();
	s1=s1.trim();
	String strLen[]=s1.split(" ");
	String s2="";
	
	for(int i=0; i<strLen.length; i++)
	{
		if(i==strLen.length-1) 
		{
			s2=strLen[i]+s2;
		}
		else
		{
			s2=" "+strLen[i]+s2;
		}
	}
	
	System.out.println(s2);
	}
}
