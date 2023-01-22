/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50
 */
package Lec6_Patterns2;

import java.util.Scanner;

public class Inverted_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>0;i--){
			for(int j=i;j>0;j--){
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}

}
/*
Sample Input 1:
5

Sample Output 1:
55555 
4444
333
22
1

Sample Input 2:
6

Sample Output 2:
666666
55555 
4444
333
22
1
*/