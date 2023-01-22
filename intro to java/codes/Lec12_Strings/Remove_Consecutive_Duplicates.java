/*
 * For a given string(str), remove all the consecutive duplicate characters.
Example:
	Input String: "aaaa"
	Expected Output: "a"
	Input String: "aabbbcc"
	Expected Output: "abc"

Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.

Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.

Constraints:
0 <= N <= 10^6
Where N is the length of the input string.
Time Limit: 1 second
 */
package Lec12_Strings;

import java.util.Scanner;

public class Remove_Consecutive_Duplicates {
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		if(str.length()!=0){
			String f="";
			char temp =str.charAt(0);
			for(int i=1;i<str.length();i++){
				if(temp!=str.charAt(i)){
					f += temp;
					temp=str.charAt(i);
				}
			}
			f += temp;
			return f;
		}
		return "";
	}
	static Scanner s= new Scanner (System.in);
	public static void main(String[] args){
		String str = s.nextLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}
		System.out.println(removeConsecutiveDuplicates(str));
	}
}
/*
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
*/