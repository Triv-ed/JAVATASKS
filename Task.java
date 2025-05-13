package taskapr30;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the byte size:");
		Scanner sc =new Scanner(System.in);
		int bsize=sc.nextInt();
		byte[] barray=new byte[bsize];
		for(int i=0; i<barray.length; i++) {
			System.out.println("Enter the byte "+(i+1)+"input");
			barray[i]=sc.nextByte();
		}
		System.out.println("The byte elements are:");
		for(int i=0; i<barray.length; i++) {
			System.out.println(barray[i]);
			
		}
		System.out.println("Enter the short array size:");
		int ssize=sc.nextInt();
		short[] sarray=new short[ssize];
		for(int i=0; i<sarray.length; i++) {
			System.out.println("Enter the short "+(i+1)+"input");
			sarray[i]=sc.nextShort();
		}
		System.out.println("The short elements are:");
		for(int i=0; i<sarray.length; i++) {
			System.out.println(sarray[i]);
			
		}
		System.out.println("Enter the integer array size:");
		int isize=sc.nextInt();
		int[] iarray=new int[isize];
		for(int i=0; i<iarray.length; i++) {
			System.out.println("Enter the integer "+(i+1)+"input");
			iarray[i]=sc.nextInt();
		}
		System.out.println("The integer elements are:");
		for(int i=0; i<iarray.length; i++) {
			System.out.println(iarray[i]);
			
		}
		System.out.println("Enter the Float array size:");
		int fsize=sc.nextInt();
		float[] farray=new float[fsize];
		for(int i=0; i<farray.length; i++) {
			System.out.println("Enter the float "+(i+1)+"input");
			farray[i]=sc.nextFloat();
		}
		System.out.println("The Float elements are:");
		for(int i=0; i<farray.length; i++) {
			System.out.println(farray[i]);
			
		}
		System.out.println("Enter the Double  array size:");
		int dsize=sc.nextInt();
	    double[] darray=new double[dsize];
		for(int i=0; i<darray.length; i++) {
			System.out.println("Enter the double "+(i+1)+"input");
			darray[i]=sc.nextDouble();
		}
		System.out.println("The double elements are:");
		for(int i=0; i<darray.length; i++) {
			System.out.println(darray[i]);
			
		}
		 System.out.println("Enter the long  array size:");
		int lsize=sc.nextInt();
	    long[] larray=new long[lsize];
		for(int i=0; i<larray.length; i++) {
			System.out.println("Enter the long "+(i+1)+"input");
			larray[i]=sc.nextLong();
		}
		System.out.println("The long elements are:");
		for(int i=0; i<larray.length; i++) {
			System.out.println(larray[i]);
			
		}
		 System.out.println("Enter the bool  array size:");
			int bosize=sc.nextInt();
		    boolean[] boarray=new boolean[bosize];
			for(int i=0; i<boarray.length; i++) {
				System.out.println("Enter the bool "+(i+1)+"input");
				boarray[i]=sc.nextBoolean();
			}
			System.out.println("The bool elements are:");
			for(int i=0; i<boarray.length; i++) {
				System.out.println(boarray[i]);
				
			}
			
			System.out.println("Enter the char  array size:");
			int csize=sc.nextInt();
		    char[] carray=new char[csize];
			for(int i=0; i<carray.length; i++) {
				System.out.println("Enter the char "+(i+1)+"input");
				carray[i]=sc.next().charAt(0);
			}
			System.out.println("The char elements are:");
			for(int i=0; i<carray.length; i++) {
				System.out.println(carray[i]);
				
			}
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
					System.out.println(starray[i]);
					
				}

	}

}
