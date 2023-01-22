/*
Write a program that takes a character as input and prints either 1, 0 or -1
according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet
*/

package Lec4_conditional_Loops;
import java.util.Scanner;
public class Find_Character_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char ch=a.charAt(0);
		int res;
		if(ch>='a'&&ch<='z') {
			res=0;
		}
		else if(ch>='A' && ch<='Z'){
			res=1;
		}
		else {
			res=-1;
		}
		System.out.println(res);

	}

}
/*
v
Sample Output 1 :
0
Sample Input 2 :
V
Sample Output 2 :
1
Sample Input 3 :
#
Sample Output 3 :
-1
*/