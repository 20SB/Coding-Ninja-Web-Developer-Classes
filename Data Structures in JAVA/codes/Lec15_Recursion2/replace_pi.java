/*
 * Given a string, compute recursively a new string where all consecutive chars represent = "pi" have been replaced with 3.14.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
 */
package Lec15_Recursion2;

import java.util.Scanner;

public class replace_pi {
	public static String replacePI(String s) {
		if(s.length()<= 1) {
			return s;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i') {
			String so = replacePI(s.substring(2));
			return 3.14 + so;
		}
		else {
			String so = replacePI(s.substring(1));
			return s.charAt(0) + so;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(replacePI(input));
	}
}
/*
Sample Input 1 :
apippiiphpii
Sample Output 1:
a3.14p3.14iph3.14i
*/