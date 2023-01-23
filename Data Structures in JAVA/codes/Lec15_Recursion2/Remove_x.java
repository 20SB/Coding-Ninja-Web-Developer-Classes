/*
 * Given a string, compute recursively a new string where all provided chars have been removed.

Input format :
String S
Char x

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
 */
package Lec15_Recursion2;

import java.util.Scanner;

public class Remove_x {
	public static String removex(String s, char x) {
		if(s.length() == 0) {
			return "";
		}
		String so = removex(s.substring(1), x);
		if(s.charAt(0) == x) {
			return so;
		}
		else {
			return s.charAt(0) + so;
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input = s.next();
		String xx = s.next();
		char x = xx.charAt(0);
		String output = removex(input,x);
		System.out.println(output);
	}

}
/*
Sample Input 1 :
xaxb x
Sample Output 1:
ab
Sample Input 2 :
abc d
Sample Output 2:
abc
Sample Input 3 :
yy y
Sample Output 3:
*/