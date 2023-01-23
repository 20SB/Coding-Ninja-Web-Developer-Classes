/*
 * Print N Fibonacci Numbers
 * Fibonacci Series : 1 1 2 3 5 8 13 21 34 55 89 144 ......

Input Format :
Integer n

Output Format :
N Fibonacci Numbers
 */
package Lec14_Recursion1;

import java.util.Scanner;

public class Print_N_Fibonacci_Numbers {
	public static void PrnFibNo(int n) {
		if(n==0) {
			return;
		}
		PrnFibNo(n-1);
		System.out.println(nFibNo(n));
		
		
	}
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
		PrnFibNo(n);
	}
}
