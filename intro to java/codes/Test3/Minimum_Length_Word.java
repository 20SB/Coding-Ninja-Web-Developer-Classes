/*
 * Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.

Input Format :
String S

Output Format :
Minimum length word

Constraints :
1 <= Length of String S <= 10^5
 */
package Test3;

import java.util.Scanner;

public class Minimum_Length_Word {
	public static String minLengthWord(String input){
		if(input.length()>0){
			int si=0;
			int mlen= Integer.MAX_VALUE;
			int i,fsi=0, fei=0;
			for(i=0;i<input.length();i++){
				if(input.charAt(i)==' '){
					int len=i-si;	//stores the length of the last word till now 
					if (len < mlen) {	//checks if it has minimum length
						mlen=len;	//if yes then update minimum length value
						fsi = si;	//and store the word's staring index and end index
						fei = i - 1;
					}
					si=i+1;
					len=0;
				}
			}
			int len = i - si;	// finds the length of the last word
			if (len < mlen) {	//checks if it has minimum length
				mlen = len;	//if yes then update minimum length value
				fsi = si;	//and store the word's staring index and end index
				fei = i - 1;
			}
			si = i + 1;
			len = 0;
			String fstring="";
			for(i=fsi;i<=fei;i++){	//copy that word to final string to return as string
				fstring+= input.charAt(i);
			}
			return fstring;
		}
		return "";
	}

	static Scanner s=new Scanner(System.in);
	
    public static void main(String[] args){	//Main Function
    	String input = s.nextLine();
        System.out.println(minLengthWord(input));
    }
}
/*
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/