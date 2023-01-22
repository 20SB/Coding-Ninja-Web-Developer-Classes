/*
 * Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
	Input Sentence: "Hello, I am Aadil!"
	The expected output will print, ",olleH I ma !lidaA".

Input Format:
	The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.

Output Format:
	The only line of output prints the sentence(string) such that each word in the sentence is reversed. 

Constraints:
	0 <= N <= 10^6
	Where N is the length of the input string.
Time Limit: 1 second
 */
package Lec12_Strings;

import java.util.Scanner;

public class Reverse_Each_Word {
	public static String reverseEachWord(String str) {
		//Your code goes here
		int si=0,i;
		int flag=0;
		String fs="";
		for(i=0;i<str.length();i++){
			String ts="";	//temporary string
			if(str.charAt(i)==' '){
				flag = flag + 1;
				for(int j=si;j<i;j++){
					ts=str.charAt(j)+ts;
				}
				si=i+1;
				if(flag==1){
					fs = fs + ts;
				}
				else{
					fs = fs + ' ' + ts;
				}
			}
		}
		String ts = "";
		for (int j = si; j < i; j++) {
			ts = str.charAt(j) + ts;
		}
		si = i + 1;
		fs = fs + " " + ts;
		return fs;
	}
	static Scanner s= new Scanner (System.in);
	public static void main(String[] args){
		String str = s.nextLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}
		System.out.println(reverseEachWord(str));
	}

}
/*
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/