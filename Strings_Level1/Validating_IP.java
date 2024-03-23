package Strings_Level1;

import java.util.Scanner;

public class Validating_IP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

	}
	

}
class MyRegex {
    String pattern;

    MyRegex() {
        // Regular expression for validating an IP address
        pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    }
}

/*
Input:-
=====

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Output:-
=======
true
true
true
false
false

false






 
 

 */
