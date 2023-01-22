/*
 * Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1

Input Format :
Integer N

Output Format :
true or false

Constraints :
0 <= n <= 10^4
 */
package Lec8_Functions_and_Scope;

import java.util.Scanner;

public class Fibonacci_Number {
	public static boolean ps(int n){
		int x=(int)Math.sqrt(n);
		return(n==(x*x));
	}
	public static boolean checkMember(int n){
		if(ps(5*n*n+4)||ps(5*n*n-4)){
			return true;
		}
		else
		return false;

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));
	}
}
/*
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/