/*
 * Given the number 'n', write a code to print numbers from n to 1 in decreasing order recursively.

Input Format :
Integer n

Output Format :
Numbers from n to 1 (separated by space)

Constraints :
1 <= n <= 10000
 */
package Lec14_Recursion1;

import java.util.Scanner;

public class Print_First_N_Natural_Numbers_in_Reverse_Order {
	public static void print(int n){
		//Write your code here
		if(n==0){
			return;
		}
		System.out.print(n + " ");
		print(n-1);
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
6 5 4 3 2 1 
Sample Input 2 :
4
Sample Output 2 :
4 3 2 1

*/