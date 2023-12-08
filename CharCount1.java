package Arrays;

import java.util.Scanner;
// sort 
public class CharCount1 {
	
	void display(char ch[]) {
		for(int i=0; i<ch.length; i++) 
		{
			System.out.print(ch[i]+" ");
		}
	}
	
	char[] counter1(char ch[])
	{
		int count=0;
		for(int i=0; i<ch.length; i++)
		{
			for(int j=0;j<ch.length;j++) 
			{
				if(ch[i]>ch[j]) {
					
					count++;
				}
				
				System.out.println("frequency of "+ch[i]+" is "+count );
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		char ch[]= new char[size];
		
		System.out.println("Enter characters: ");
		for(int i=0; i<size; i++) 
		{
			ch[i]= sc.next().charAt(0);
		}
		CharCount1 cc=new CharCount1();
		cc.display(ch);
		cc.counter1(ch);

	}

}
