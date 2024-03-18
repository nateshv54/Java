package Patterns;

import java.util.Scanner;

public class Char_RH_Pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int n=s.nextInt();
		pattern_fixed_range_char(n);
		System.out.println("\n");
		increasing_char(n);

	}
	public static void pattern_fixed_range_char(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
	public static void increasing_char(int n) {
		int k=65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(k)+" ");
				k+=1;
			}
			System.out.println();
		}
	}

}
