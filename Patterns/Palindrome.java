package Patterns;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of rows: ");
		int n=s.nextInt();
		int j;
		for(int i=1;i<=n;i++) {
			for(j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//to print lefthalf num triangle
			for(j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			//to print Righthalf num triangle
			for(j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

/*
 Output:
Enter no.of rows: 3
    1 
  2 1 2 
3 2 1 2 3 

 
 */
