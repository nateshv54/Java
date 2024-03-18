package Patterns;

import java.util.Scanner;

public class Numbers_RH_Pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		pattern_in_range(n);
		System.out.println();
		increasing_num_pattern(n);
		

	}
	public static void pattern_in_range(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	
	public static void increasing_num_pattern(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k+=1;
			}
			System.out.println();
		}
		
	}
	

}


/*
 
Enter a number
5
1
12
123
1234
12345

*/



/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */
