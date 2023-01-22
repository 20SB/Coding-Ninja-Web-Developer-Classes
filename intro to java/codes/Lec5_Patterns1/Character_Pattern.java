/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 13
 */
package Lec5_Patterns1;

import java.util.Scanner;

public class Character_Pattern {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char ch;
		for(int i=0;i<n;i++){
			int k=i;
			for(int j=0;j<=i;j++){
				ch=(char)(k+65);
				k++;
				System.out.print(ch);
			}
			System.out.print("\n");
		}
		
	}
}
/*
Sample Input 1:
5

Sample Output 1:
A
BC
CDE
DEFG
EFGHI

Sample Input 2:
6

Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK
*/