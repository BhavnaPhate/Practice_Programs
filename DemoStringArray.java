package Arrays;

import java.util.Scanner;

public class DemoStringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		str=str.trim();
		DemoStringArray obj=new DemoStringArray();
		String s2=obj.replacer(str);
		System.out.println(s2);

	}

	String replacer(String str) {
		char ch[]=new char[str.length()];
		for(int i=0; i<ch.length;i++) {
			if(i==0) {
				ch[i]=Character.toUpperCase(str.charAt(i));
			}
			else {
				if(str.charAt(i-1)==' ') {
					ch[i]=Character.toUpperCase(str.charAt(i));
				}
				else {
					ch[i]=str.charAt(i);
				}
			}
		}
		String s2=String.valueOf(ch);
		return s2;
	}
}
