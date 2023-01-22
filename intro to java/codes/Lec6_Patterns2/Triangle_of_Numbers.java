/*
 * Print the following pattern for the given number of rows.
Pattern for N = 4
   1
  232
 34543
4567654
The dots represent spaces.

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Triangle_of_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}int k=i;
			for(int j=1;j<=i;j++){
				System.out.print(k++);
			}k--;
			for(int j=1;j<i;j++){
				System.out.print(--k);
			}
			System.out.print("\n");
		}
	}
}
/*
Sample Input 1:
5

Sample Output 1:
    1
   232
  34543
 4567654
567898765

Sample Input 2:
4

Sample Output 2:
   1
  232
 34543
4567654
*/