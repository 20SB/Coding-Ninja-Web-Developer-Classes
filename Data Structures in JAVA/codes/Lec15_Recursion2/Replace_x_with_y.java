/*
 * Given a string, compute recursively a new string where all provided chars (x) have been replaced by char (y).

Input format :
String S
Char x, y

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
 */
package Lec15_Recursion2;

import java.util.Scanner;

public class Replace_x_with_y {
	public static String replaceXY(String s, char x, char y) {
		if(s.length() == 0) {
			return "";
		}
		String so = replaceXY(s.substring(1),x,y);
		if(s.charAt(0) == x) {
			return y + so;
		}
		else {
			return s.charAt(0) + so;
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input = s.next();
		String xx = s.next(),yy = s.next();
		char x = xx.charAt(0), y = yy.charAt(0);
		String output = replaceXY(input, x, y);
		System.out.println(output);
	}
}
/*
Sample Input 1 :
xaxb x y
Sample Output 1:
yayb
Sample Input 2 :
abc d x
Sample Output 2:
abc
Sample Input 3 :
yy y x
Sample Output 3:
xx
*/