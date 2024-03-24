package Patterns;

import java.util.*;

public class Hollow_Triangle {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of rows: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			
			//outer spaces
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				if(k==1||i==n||k==(2*i-1)) {
					System.out.print("*");
				}
				//for spaces inside pattern
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/*
Enter no.of rows: 4
    *
   * *
  *   *
 *******

 
 */
