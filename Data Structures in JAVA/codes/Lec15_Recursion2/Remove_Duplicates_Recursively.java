/*
 * Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
 */
package Lec15_Recursion2;

import java.util.Scanner;

public class Remove_Duplicates_Recursively {
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length()<=1){
			return s;
		}
		String so = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0) == s.charAt(1)){
			return  so;
		}
		else{
			return s.charAt(0) + so;
		}
	}
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
    }
}
/*
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/