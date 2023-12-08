package Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		int marks[]=new int[10];
		System.out.println(marks.length);
		
		//initializing the element to array
		marks[0]=50;
		marks[1]=90;
		marks[5]=110;
		marks[4]=28;
		//Iterating all elements from array using loop
		
		int index=0;
		while(index < marks.length) {
			System.out.println(marks[index]);
			index++;
		}
	}

}
