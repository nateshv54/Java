package Patterns;

import java.util.Scanner;

public class Diamond_star {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of rows: ");
		int n=s.nextInt();
		//Upper triangle
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Lower triangle
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//adjusting spaces
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

/*
 Output:-
 
 Enter no.of rows: 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


 */
