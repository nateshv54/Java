package Patterns;

import java.util.Scanner;

public class X_pattern {
	static public void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        //Input should be odd length
        String str1 = scanner.nextLine();
        int n = str1.length();
        
        for(int i=0;i<n;i++) {
        	int j=n-1-i;
        	for(int k=0;k<n;k++) {
        		if(k==i||k==j) {
        			System.out.print(str1.charAt(k));
        		}
        		else {
        			System.out.print(" ");
        		}
        	
        	}System.out.println("");
        }
             }
}

/*
Output:-

Enter the string: German
G    n
 e  a 
  rm  
  rm  
 e  a 
G    n

Enter the string: Hello
H   o
 e l 
  l  
 e l 
H   o



 */
