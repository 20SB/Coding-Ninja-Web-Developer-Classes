/*
 * Print the following pattern for the given N number of rows.

Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :

Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50
 */
package Lec5_Patterns1;

import java.util.Scanner;

public class Triangular_Star_Pattern {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		
	}
}
/*
Sample Input 1:
5

Sample Output 1:
*
**
***
****
*****

Sample Input 2:
6

Sample Output 2:
*
**
***
****
*****
******

*/
