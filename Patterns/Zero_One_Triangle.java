package Patterns;

import java.util.Scanner;

public class Zero_One_Triangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int n=s.nextInt();
		Zero_one_pattern(n);
		System.out.println();
	
		

	}
	public static void Zero_one_pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1"+" ");
				}
				else {
					System.out.print("0"+" ");
				}
				
			}
			System.out.println();
			
		}
	}
}

/*
Output:-
Enter no.of rows
5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

 
 
 */
