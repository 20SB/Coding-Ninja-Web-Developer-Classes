/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26
 */
package Lec5_Patterns1;

import java.util.Scanner;

public class Alpha_Pattern {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char ch;
		for(int i=0;i<n;i++){
			ch=(char)(i+65);
			for(int j=0;j<=i;j++){
				System.out.print(ch);
			}
			System.out.print("\n");
		}
	}
}

/*
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/
