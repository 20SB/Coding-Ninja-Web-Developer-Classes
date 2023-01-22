/*
 * Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line

Output format :
Word wise reversed string in a single line

Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
 */
package Lec12_Strings;

import java.util.Scanner;

public class Reverse_String_Wordwise {
	public static String reverseWordWise(String input) {
		int i=0,se=0;
		String ns="";
		for(i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				String nw="";
				for(int j=se;j<i;j++){
					nw+=input.charAt(j);
				}
				se=i+1;
				ns=nw+' '+ns;
			}
		}
		String nw = "";
		for (int j = se; j < input.length(); j++) {
			nw += input.charAt(j);
		}
		ns = nw + ' ' + ns;
		return ns;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}
}
/*
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/