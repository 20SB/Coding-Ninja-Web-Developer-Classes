/*
 * Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
 */
package Test1;

import java.util.Scanner;

public class Number_Star_pattern_1 {
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>0;j--){
				if(j==i){
					System.out.print("*");
					continue;
				}
				else{
					System.out.print(j);
				}
			}
			System.out.print("\n");
		}
	}
}
/*
Sample Input :
5
Sample Output :
5432*
543*1
54*21
5*321
*4321

*/