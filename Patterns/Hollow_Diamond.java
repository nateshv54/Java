package Patterns;

import java.util.Scanner;

public class Hollow_Diamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of rows: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Lower hollow diamond part
		for(int i=n-1;i>=1;i--) {
			//outer spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//inner spaces
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

/*
 
 Enter no.of rows: 3
  *
 * *
*   *
 * *
  *


 */
