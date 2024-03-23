package Strings_Level1;

import java.util.Scanner;

public class String_Tokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
        String s = scan.nextLine();
        // Write your code here.
     if (s.trim().length()==0 || s.trim().length()>400000)
    {
        System.out.println(0);
        return;
    }

    String words[]=s.trim().split("[ !,?.\\_'@]+");
    System.out.println(words.length);
    for (String word:words)
        System.out.println(word);
    }

	}

