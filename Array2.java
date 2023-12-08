package Arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id: ");
		int id=sc.nextInt();
		System.out.println("Enter the Name: ");
		String name=sc.next();
		System.out.println("Enter Phone Number: ");
		long ph=sc.nextLong();
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
	    System.out.println(id+" "+ name+" "+ ph+" "+salary);	
	}

}
