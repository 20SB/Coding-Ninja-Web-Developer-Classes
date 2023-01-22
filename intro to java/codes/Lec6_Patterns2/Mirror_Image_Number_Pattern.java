/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 5
    1
   12
  123
 1234
12345
The dots represent spaces.

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Mirror_Image_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}	
	}

}
/*
Sample Input 1:
3

Sample Output 1:
  1
 12
123

Sample Input 2:
4

Sample Output 2:
   1
  12
 123
1234
*/