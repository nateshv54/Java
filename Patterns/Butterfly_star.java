package Patterns;

import java.util.Scanner;

public class Butterfly_star {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of rows: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			//left upper part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for spaces
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//Right upper part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Lower part
		for(int i=n;i>=1;i--) {
			//left lower part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//Left lower part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
/*
 Enter no.of rows: 5
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


 */
