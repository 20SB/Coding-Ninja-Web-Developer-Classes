/*
 * Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
 */
package Assignment_Recursion;

import java.util.Scanner;

public class Check_Palindrome_recursively {
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		if (input.length() == 1 || input.length() == 0) {
			return true;
		}
		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			return isStringPalindrome(input.substring(1, input.length() - 1));
		} 
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}
}
/*
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/