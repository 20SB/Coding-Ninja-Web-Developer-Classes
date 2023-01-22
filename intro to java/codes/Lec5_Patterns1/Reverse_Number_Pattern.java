/*
 * Print the following pattern for the given N number of rows.

Pattern for N = 4
1
21
321
4321

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50
 */
package Lec5_Patterns1;

import java.util.Scanner;

public class Reverse_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//System.out.println("n="+n);
		for(int i=1;i<=n;i++){
			//System.out.println("i= "+i);
			for(int j=i;j>0;j--){
				System.out.print(j);
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
21
321
4321
54321

Sample Input 2:
6

Sample Output 2:
1
21
321
4321
54321
654321
*/