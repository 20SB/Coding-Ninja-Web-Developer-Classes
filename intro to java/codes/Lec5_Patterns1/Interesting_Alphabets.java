/*
 * Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE

Input format :
N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26
 */
package Lec5_Patterns1;

import java.util.Scanner;

public class Interesting_Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>0;i--){
			int k=i-1;
			char ch;
			for(int j=0;j<=n-i;j++){
				ch=(char)(65+k);
				k++;
				System.out.print(ch);
			}
			System.out.print("\n");
		}
	}

}
/*
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/