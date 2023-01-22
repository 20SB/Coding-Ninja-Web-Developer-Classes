/*
 * Write a program to print parallelogram pattern for the given N number of rows.
For N = 4
****
 ****
  ****
   ****
The dots represent spaces.

Input Format :
A single integer : N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Parallelogram_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
/*
Sample Input 1 :
3

Sample Output 1 :
***
 ***
  ***

Sample Input 2 :
5

Sample Output 2 :
*****
 *****
  *****
   *****
    *****

*/