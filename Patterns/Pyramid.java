package Patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int n=s.nextInt();
		star_pattern(n);
		System.out.println();
		number_pyramid(n);
		System.out.println();
		char_pyramid(n);
		
	}
	public static void star_pattern(int n) {
		for(int k=1;k<=n;k++) {
			
			//To adjust spaces
			for(int i=1;i<=n-k;i++) {
				System.out.print(" ");
			}
				//To adjust printing variable and space
				for(int i=1;i<=k;i++) {
					System.out.print("*"+" ");
				}
			
			System.out.println();
		}
	}
	
	public static void number_pyramid(int n) {
		int num=1;
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n-k;i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=k;i++) {
				System.out.print(num+" ");
				num+=1;
			}
			System.out.println();
		}
	}
	public static void char_pyramid(int n) {
		int num=65;
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n-k;i++) {
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++) {
				System.out.print((char)(num)+" ");
				num+=1;
			}
			System.out.println();
		}
	}

}

/*
Enter no.of rows: 
5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

    1 
   2 3 
  4 5 6 
 7 8 9 10 
11 12 13 14 15 

    A 
   B C 
  D E F 
 G H I J 
K L M N O 


 */
