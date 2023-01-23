/*
 * Print Nth Fibonacci Number
 * Fibonacci Series : 1 1 2 3 5 8 13 21 34 55 89 144 ......

Input Format :
Integer n

Output Format :
Nth Fibonacci Number
 */
package Lec14_Recursion1;

import java.util.Scanner;

public class Nth_Fibonacci_Number {
	public static int nFibNo(int n){
		//Write your code here
		if(n==1 || n==2){
			return 1;
		}
		int f1 = nFibNo(n-1);
		int f2 = nFibNo(n-2);
		int output = f1 + f2;
		return output;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = nFibNo(n);
		System.out.println(result);
	}
}
/*
Sample Input 1 :
5
Sample Output 1 :
5
Sample Input 2 :
7
Sample Output 2 :
13
*/