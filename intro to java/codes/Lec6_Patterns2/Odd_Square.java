/*
 * Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135

Input Format :
A single integer: N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Odd_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<2*n;i=i+2){
			for(int j=i;j<=(2*n-1);j=j+2){
				System.out.print(j);
			}
			for(int j=1;j<i;j=j+2){
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

}
/*
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/