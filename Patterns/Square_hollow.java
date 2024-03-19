package Patterns;

import java.util.Scanner;

public class Square_hollow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int n=s.nextInt();
		squarehollow_1(n);
		

	}
	public static void squarehollow_1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1||j==n/2 || i==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				System.out.print(' ');
			}
			System.out.println();
		}
	}

}

/*
 Enter no.of rows
5
* * * * * 
*   *   * 
* * * * * 
*   *   * 
* * * * * 

 
*/