/*
 * Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.

Input Format :
Integer n

Output Format :
Numbers from 1 to n (separated by space)

Constraints :
1 <= n <= 10000
 */
package Lec14_Recursion1;

import java.util.Scanner;

public class Print_First_N_Natural_Numbers {
	public static void print(int n){
		//Write your code here
		if(n==0){
			return;
		}
		print(n-1);
		System.out.print(n + " ");
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);
	}
}
/*
Sample Input 1 :
6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
4
Sample Output 2 :
1 2 3 4

*/