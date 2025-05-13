package taskapr30;

import java.util.Scanner;

public class SteingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the string array size:");
			int stsize=sc.nextInt();
			sc.nextLine();
		    String[] starray=new String[stsize];
			for(int i=0; i<starray.length; i++) {
				System.out.println("Enter the String "+(i+1)+"input");
				starray[i]=sc.nextLine();
			}
			System.out.println("The string elements are:");
			for(int i=0; i<starray.length; i++) {
				System.out.print("[");
				System.out.print(starray[i]);
				System.out.print(",]");
			}
	}

}
