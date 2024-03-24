package Patterns;

import java.util.Scanner;

public class Hollow_Hourglass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of rows: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			//
			for(int j=i;j<=n;j++) {
				if(j==i||j==n||i==1) {
					System.out.print("* ");
				}
				//Two spaces for hollow effect
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				if(j==i||j==n||i==1||i==n) {
					System.out.print("* ");
				}
				//Remember two spaces for hollow effect
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
