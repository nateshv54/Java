package Patterns;

import java.util.Scanner;

public class Reverse_Right_Half_Pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}

/*
Output:

Enter no.of rows: 
5
*****
****
***
**
*



*/