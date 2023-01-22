/*
 * Print the following pattern for the given number of rows.
Note: N is always odd.

Pattern for N = 5
  *
 ***
*****
 ***
  *
The dots represent spaces.

Input format :
N (Total no. of rows and can only be odd)

Output format :
Pattern in N lines

Constraints :
1 <= N <= 49
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Diamond_of_stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n/2+1;i++){
            for(int j=1;j<=(n/2)-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*(n/2)-(2*(i+1));j++){
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
 ***
*****
 ***
  *

Sample Input 2:
3

Sample Output 2:
  *
 ***
  *

*/