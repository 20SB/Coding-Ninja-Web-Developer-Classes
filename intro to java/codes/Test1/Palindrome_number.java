/*
 * Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
 */
package Test1;

import java.util.Scanner;

public class Palindrome_number {
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n,rem=0,nno=0;
		for(;n!=0;){
			rem=n%10;
			nno=nno*10+rem;
			n=n/10;
		}
		if(temp==nno){
			System.out.print("true");
		}
		else
		System.out.print("false");
	}
	
}
/*
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false
*/